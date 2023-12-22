import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		boolean set = true;

		int count = 0;

		ArrayList<String> result = new ArrayList<String>();

		//シャッフルを始める
		while(set)
		{
			//データを入力する
			String str = input.readLine();

			//終了条件
			if(str.equals("-"))
			{
				for(int num = 0; num < count; num++)
					System.out.println(result.get(num));

				break;
			}

			//カードごとに分ける
				char[] cards = str.toCharArray();

			int kaisuu = Integer.parseInt(input.readLine());

			int[] maisuu = new int[kaisuu];

			//カードをとる枚数を入力する
			for(int num = 0; num < kaisuu; num++)
				maisuu[num] = Integer.parseInt(input.readLine());

			char[] over = new char[cards.length];

			//シャッフルする
			for(int kai = 0; kai < kaisuu; kai++)
			{
				for(int mai = 0; mai < cards.length; mai++)
				{
					if(mai + maisuu[kai] < cards.length)
						over[mai] = cards[mai + maisuu[kai]];
					else
					{
						over[mai] = cards[mai + maisuu[kai] - cards.length];
					}
				}

				for(int num = 0; num < cards.length; num++)
					cards[num] = over[num];

			}

			result.add(String.valueOf(cards));

			count++;

		}
	}
}

