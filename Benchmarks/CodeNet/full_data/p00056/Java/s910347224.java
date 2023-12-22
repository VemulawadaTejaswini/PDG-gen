import java.util.Scanner;

public class Main {

	static final int MAX = 50000;
	static boolean[] era = new boolean[MAX+1];
	static{
		era[0]=era[1]=true;
		for (int i = 2; i*i <= MAX ; i++) {
			if(!era[i]) for (int j = i*2; j <=MAX ; j+=i) {
				era[j]=true;
			}
		}
	}


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		while((n=scan.nextInt())!=0){
			int k=0;
			for (int i = 2; i <=n/2 ; i++) {
				if(n-i<0) break;
				if(!era[i] && !era[n-i]) k++;
			}
			System.out.println(k);
		}
	}
}