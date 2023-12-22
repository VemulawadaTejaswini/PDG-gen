import java.util.Scanner;

public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] t = new int[n][600];
			for(int i=0;i<n;i++){
				int k = sc.nextInt();
				sc.nextInt();
				int[] a = new int[k];
				for(int j=0;j<k;j++)a[j]=sc.nextInt();
				for(int j=0;j<600;j++)t[i][j] = a[j%k];
			}
			int max = 0;
			for(int j=0;j<600;j++){
				int sum = 0;
				for(int i=0;i<n;i++)sum+=t[i][j];
				max = Math.max(max, sum);
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}