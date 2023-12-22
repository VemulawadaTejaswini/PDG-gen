import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,no,k,t;;
		long workers[]=new long[4001];
		boolean flag;
		while(true){
			flag=false;
			Arrays.fill(workers, 0);
			n=sc.nextInt();
			if(n==0) break;
			for(i=0;i<n;i++){
				no=sc.nextInt();
				k=sc.nextInt();
				t=sc.nextInt();
				workers[no]+=k*t;
			}
			for(i=0;i<4001;i++){
				if(1000000<=workers[i]){
					System.out.println(i);
					flag=true;
				}
			}
			if(!flag){
				System.out.println("NA");
			}
		}
	}
}