import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str," ");

		int ar[] = new int[3];

		for (int i=0;i<3;i++){
			 ar[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(ar);		

		for (int i=0;i<3;i++){
			System.out.print(ar[i]);
		}
	}
}