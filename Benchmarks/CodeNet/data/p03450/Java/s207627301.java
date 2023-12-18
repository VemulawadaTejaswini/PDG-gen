import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] ins = in.split(" ");

		//人の数
		int people = Integer.parseInt(ins[0]);
		//与えられる情報の数
		int infoNum = Integer.parseInt(ins[1]);

		//人の数分の配列を作成
		int[] arrays = new int[people];
		//初期値に0を設定
		for (int i = 0; i < people; i++)
		{
			arrays[i] = 0;
		}
		Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
		boolean result = true;
		for (int i = 0; i < infoNum; i++)
		{
			String line = sc.nextLine();
			String[] lines = line.split(" ");

			//基準
			int base = Integer.parseInt(lines[0]);
			//対象
			int target = Integer.parseInt(lines[1]);
			//右にずれる位置
			int rightPoint = Integer.parseInt(lines[2]);

			//基準の位置を取得
			int basePoint = arrays[base - 1];
			//移動先の位置
			int targetPoint = basePoint + rightPoint;
			//対象の現在の位置
			int currentPoint = arrays[target - 1];

			//マップのキーに設定されていない、かつ
			//対象の現在位置が0の場合は未設定とみなす
			if (!map.containsKey(target) && currentPoint == 0)
			{
				arrays[target - 1] = targetPoint;
				currentPoint = targetPoint;
			}
			//対象の現在の位置と移動先の位置が異なる場合
			if (targetPoint != currentPoint)
			{
				result = false;
				break;
			}

			Map<Integer, Integer> map2 = map.get(basePoint);
			if (map2 == null)
			{
				map2 = new HashMap();
			}
			map2.put(target, rightPoint);
			map.put(base, map2);

			//依存している座標の再計算
			Map<Integer, Integer> map3 = map.get(target);
			if (map3 == null)
			{
				continue;
			}
			for (int j : map3.keySet())
			{
				int k = arrays[j - 1];
				k += rightPoint;
				arrays[j - 1] = k;
			}

		}
		String resultStr = result ? "Yes" : "No";
		System.out.println(resultStr);
	}

}
