package pkg0329;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11a {

	public static void main(String[] args) throws Exception
	{
		int[] nDice = new int[6];

			int nT = 1;

				int nN = 5;
		int nW = 4,nB = 6,nE = 3;
				int nS = 2;


			int nSumDice=0;

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
			String[] strDice = br.readLine().split(" ");

			String strGetch = br.readLine();
			char[] cArray = strGetch.toCharArray();

			for(int i=0; i<6; i++)
			{
				nDice[i] = Integer.parseInt(strDice[i]);
			}

			for(char c : cArray)
			{
				nSumDice = nN + nS + nE + nW + nB;

				if(c == 'E')
				{
					nW = nB;
					nB = nE;
					nE = 21 - nSumDice;
				}
				else if(c == 'W')
				{
					nE = nB;
					nB = nW;
					nW = 21 - nSumDice;
				}
				else if(c == 'S')
				{
					nN = nB;
					nB = nS;
					nS = 21 - nSumDice;
				}
				else if(c == 'N')
				{
					nS = nB;
					nB = nN;
					nN = 21 - nSumDice;
				}

				nT = 21 - (nN + nS + nW + nE + nB);

				System.out.printf("%3d\n",nN);
				System.out.printf("%d %d %d\n",nW,nB,nE);
				System.out.printf("%3d\n",nS);

			}

			System.out.println(nDice[nT-1]);

	}
}