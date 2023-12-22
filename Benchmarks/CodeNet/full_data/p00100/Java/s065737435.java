import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N=cin.nextInt();
			if(N==0){
				break;
			}
			long[] a = new long[4001];
			long max=-1;
			for(int i = 0; i <N;i++){
				int sha = cin.nextInt();
				long tan = cin.nextInt();
				long suu = cin.nextInt();
				a[sha]+=tan*suu;
				max=Math.max(max,a[sha]);
			}
			boolean f = false;
			for(int i = 1;i<=4000;i++){
				if(a[i]>=1000000){
					System.out.println(i);
					f=true;
				}
			}
			if(!f){
				System.out.println("NA");
			}
		}

	}

}