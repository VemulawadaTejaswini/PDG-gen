import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();

		if(S.contains(T))
		{
			System.out.println(0);
		}
		else
		{
			char[] sArray = S.toCharArray();
			char[] tArray = T.toCharArray();

			int lengthDiff = S.length()-T.length() + 1;
			//System.out.println(String.format("lengthDiff = {0}", S.length()-T.length()));

			int maxSameCharCount = 0;

			for(int i=0; i<lengthDiff;i++)
			{
				int sameCharCounter=0;
				for(int j=0; j<tArray.length;j++)
				{
					//System.out.println("sArray[i+j]" + sArray[i+j]);
					//System.out.println("tArray[j]" + tArray[j]);

					if(sArray[i+j] == tArray[j]) sameCharCounter++;
				}

				if(maxSameCharCount < sameCharCounter)
				{
					maxSameCharCount = sameCharCounter;
				}
				//System.out.println();
			}

			System.out.println(T.length()-maxSameCharCount);
		}
	}
}
