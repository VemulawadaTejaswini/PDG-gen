import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		//何行読み取るか
		String str = input.readLine();

		int[] alphabet = new int[26];;

		//配列の初期化
		for(int num = 0; num < alphabet.length; num++)
		{
			alphabet[num] = 0;
		}

		char moji;

		char MOJI;

		//文字列のアルファベットの数を数える
		for(int num = 0; num < str.length(); num++)
		{
			moji = 'a';

			MOJI = 'A';

			for(int kazu = 0; kazu < alphabet.length; kazu++, moji++, MOJI++)
			{
				if(str.charAt(num) ==  moji || str.charAt(num) ==  MOJI)
				{
					alphabet[kazu]++;

				break;
				}
			}
		}

		moji = 'a';

		//結果を表示する
		for(int num = 0; num < alphabet.length; num++, moji++)
		{
			System.out.println(moji + " : " + alphabet[num]);
		}

	}
}

