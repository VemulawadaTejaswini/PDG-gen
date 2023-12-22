import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				int M=sc.nextInt();
				int P=sc.nextInt();
				if(N==0) break;
				int cost=0;
				int sum=0;
				for(int i=1; i<=N; i++) {
					int gold=sc.nextInt();
					if(i==M) {
						cost=gold;
					}
					sum+=gold;
				}
				int ans=(cost==0)? 0:(sum*100*(100-P)/100)/cost;
				System.out.println(ans);

			}
		}
	}
} 
