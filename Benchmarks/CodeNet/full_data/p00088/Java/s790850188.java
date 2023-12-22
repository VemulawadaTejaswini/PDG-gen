import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){		
		new AOJ0088();
	}


	class AOJ0088{
		public AOJ0088() {
			Map<Character,String> fase1 = new HashMap<Character, String>();
			fase1.put(' ',"101");
			fase1.put('\'',"000000");
			fase1.put(',',"000011");
			fase1.put('-',"10010001");
			fase1.put('.',"010001");
			fase1.put('?',"000001");
			fase1.put('A',"100101");
			fase1.put('B',"10011010");
			fase1.put('C',"0101");
			fase1.put('D',"0001");
			fase1.put('E',"110");
			fase1.put('F',"01001");
			fase1.put('G',"10011011");
			fase1.put('H',"010000");
			fase1.put('I',"0111");
			fase1.put('J',"10011000");
			fase1.put('K',"0110");
			fase1.put('L',"00100");
			fase1.put('M',"10011001");
			fase1.put('N',"10011110");
			fase1.put('O',"00101");
			fase1.put('P',"111");
			fase1.put('Q',"10011111");
			fase1.put('R',"1000");
			fase1.put('S',"00110");
			fase1.put('T',"00111");
			fase1.put('U',"10011100");
			fase1.put('V',"10011101");
			fase1.put('W',"000010");
			fase1.put('X',"10010010");
			fase1.put('Y',"10010011");
			fase1.put('Z',"10010000");
			Map<String,Character> fase2 = new HashMap<String, Character>();
			fase2.put("00000",'A');
			fase2.put("00001",'B');
			fase2.put("00010",'C');
			fase2.put("00011",'D');
			fase2.put("00100",'E');
			fase2.put("00101",'F');
			fase2.put("00110",'G');
			fase2.put("00111",'H');
			fase2.put("01000",'I');
			fase2.put("01001",'J');
			fase2.put("01010",'K');
			fase2.put("01011",'L');
			fase2.put("01100",'M');
			fase2.put("01101",'N');
			fase2.put("01110",'O');
			fase2.put("01111",'P');
			fase2.put("10000",'Q');
			fase2.put("10001",'R');
			fase2.put("10010",'S');
			fase2.put("10011",'T');
			fase2.put("10100",'U');
			fase2.put("10101",'V');
			fase2.put("10110",'W');
			fase2.put("10111",'X');
			fase2.put("11000",'Y');
			fase2.put("11001",'Z');
			fase2.put("11010",' ');
			fase2.put("11011",'.');
			fase2.put("11100",',');
			fase2.put("11101",'-');
			fase2.put("11110",'\'');
			fase2.put("11111",'?');
			while(in.hasNext()){
				String input = in.nextLine();
				String change = "";
				for(int i=0;i<input.length();i++)change+=fase1.get(input.charAt(i));
				for(;change.length()%5!=0;)change+="0";
				String result = "";
				for(int i=0;i<change.length();i+=5)result += fase2.get(change.substring(i,i+5));
				System.out.println(result);
			}
		}
	}

	class AOJ2503{
		int MAX = 0;
		public AOJ2503() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();

			int[][] cost = new int[n][n];

			int[] dp = new int[n];
			for(int i=0;i<n*n;i++){
				cost[i/n][i%n]=MAX;
			}
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b]=in.nextInt();
			}	
			//			TODO 一番大きいパスを0のポイントからn-1のポイントまでの

			for(int s=1;s<n;s++){
				for(int i=0;i<=s;i++){
					if(cost[i][s]==MAX)continue;
					dp[s]=Math.max(dp[s],dp[i]+cost[i][s]);
				}
			}
			for(int s=0;s<n;s++)for(int i=0;i<n;i++){
				if(cost[s][i]==MAX)continue;
				dp[i]=Math.max(dp[s]+cost[s][i],dp[i]);
			}
			for(int i=0;i<n;i++)System.out.print(dp[i]+" ");
			System.out.println();
			System.out.println(dp[n-1]);
		}
	}
}