import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String input[] = br.readLine().split(" ");
		int count = Integer.parseInt(input[0]);
		int maxLength =  Integer.parseInt(input[1]);
		String input2[] =br.readLine().split(" ");
		//himo[][0]は紐の長さ
		//himo[][1]は最後まで切らないフラグが経てば1
		int himo[][] = new int[count][2];
		int total = 0;
		int himoco = 0;
		int before = 0;
		int lasthimo = 0;
		boolean flag = true;
		for(String s : input2) {
			int num =Integer.parseInt(s);
			himo[himoco][0] = num;
			himo[himoco][1] = 0;
			if(before != 0 && before + num >=maxLength && flag) {
				himo[himoco-1][1]=1;
				himo[himoco][1]=1;
				lasthimo = himoco;
				flag = false;
			}
			before = num;
			total += num;
			himoco++;
		}
		if(total < maxLength || flag) {
			System.out.println("Impossible");
			return;
		}
		int left = 0;
		boolean lFlag = false;
		int right = count-1;
		boolean rFlag = false;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(;;) {
			if(himo[left][1]==0) {
				result.add(++left);
			}else {
				lFlag = true;
			}
			if(himo[right][1]==0) {
				result.add(right--);
			}else {
				rFlag = true;
			}
			if(lFlag && rFlag) {
				break;
			}
		}
		result.add(lasthimo);
		System.out.println("Possible");
		for(int re:result) {
			System.out.println(re);
		}
	}
}