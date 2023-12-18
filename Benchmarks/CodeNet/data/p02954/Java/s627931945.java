import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int i, all, tmp;
		int n = s.length();
		int[] result = new int[n];

		for(i=0; i<n-1; i++){
			if( s.charAt(i) == 'R' && s.charAt(i+1) == 'L' ){
				tmp = countLeftR(s, i);
				all = tmp + countRightL(s, i+1, n);
				result[i] = result[i+1] = all/2;
				if( all % 2 == 1 ){
					if( tmp % 2 == 0 )
						result[i+1]++;
					else
						result[i]++;
				}
			}
		}

		System.out.print(result[0]);
		for(i=1; i<n; i++)
			System.out.print(" " + result[i]);
		System.out.println();
	}

	public static int countLeftR(String s, int pos){
		int count = 0;
		for(int i=pos; 0<=i && s.charAt(i) == 'R'; i--)
			count++;
		return count;
	}

	public static int countRightL(String s, int pos, int n){
		int count = 0;
		for(int i=pos; i<n && s.charAt(i) == 'L'; i++)
			count++;
		return count;
	}
}
