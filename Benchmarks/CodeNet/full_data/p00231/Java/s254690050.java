import java.util.Scanner;

//Dangerous Bridge
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			boolean[][] map = new boolean[n][231];
			int[] w = new int[n];
			for(int i=0;i<n;i++){
				w[i] = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				for(int j=a;j<b;j++)map[i][j] = true;
			}
			boolean f = true;
			for(int i=0;i<231;i++){
				int sum = 0;
				for(int j=0;j<n;j++){
					if(map[j][i])sum+=w[j];
				}
				if(sum>150){
					f = false;
					break;
				}
			}
			System.out.println(f?"OK":"NG");
		}
	}
}