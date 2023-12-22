import java.io.*;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] tryangle= new int[num][3];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < tryangle[i].length; j++) {
				tryangle[i][j] = Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
		final int adge1=0;
		final int adge2=1;
		final int adge3=2;
		
		for(int i=0;i<num;i++){
			int a = tryangle[i][adge1]*tryangle[i][adge1];
			int b = tryangle[i][adge2]*tryangle[i][adge2];
			int c = tryangle[i][adge3]*tryangle[i][adge3];
			if(((a+b)==c)||((b+c)==a)||((a+c)==b)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}