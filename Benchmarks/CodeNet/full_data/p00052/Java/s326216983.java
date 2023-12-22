import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int cnt=0;
			int mtp=1;
			int idx=1;
			while(n>=idx){
				mtp*=idx;
//				System.out.println("idx="+idx+" mtp="+mtp+" cnt="+cnt);
				while(true){
					if(mtp%10==0){
						mtp/=10;
						cnt++;
					}
					else{
						break;
					}
				}
				if(100<mtp){
					int tmp=mtp/100;
					mtp=mtp-(100*tmp);
				}
				idx++;
			}
			System.out.println(cnt);
		}
	}
}