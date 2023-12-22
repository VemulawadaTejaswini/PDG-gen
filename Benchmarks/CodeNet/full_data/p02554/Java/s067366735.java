
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			// R(N+1)=10*R(N)+2*NR(N-1);
			// NR(N)=10^N-R(N)
			// R(1)=0 NR(1)=10
			// R(2)=2 NR(2)=98
			// R(3)=40 
			// R(N+1)=10*R(N)+2*(10^N-1)-R(N-1))
			// R(N+1)=10*R(n)+2*10^N-2R(N-1);
		
			int N = sc.nextInt();

			int divider = (int)Math.pow(10,9)+7;
			
			int ret = resultFunc(N,divider);

			System.out.println(ret);
	}	
	
	public static int resultFunc(int num,int div) {
		int ret=0;
		int ret_m1=2;
		int ret_m2=0;
		if(num==1) {
				return 0;
		}else if(num==2) {
				return 2;
		}else {
			for(int i=3;i<=num;++i) {
				int neck = (int)((Math.pow(10, num-2)*2 -2*ret_m2)%div);
				ret = (10*ret_m1 + neck )%div;
				ret_m2=ret_m1;
				ret_m1=ret;
			}
			return ret;
		}
	}
}