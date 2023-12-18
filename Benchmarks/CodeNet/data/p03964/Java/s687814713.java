import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		long a1 = sn.nextLong(),b1 = sn.nextLong();
		long total = a1+b1;
		int flag;
		for(int i = 1; i < N;++i){
			long a2 = sn.nextLong();
			long b2 = sn.nextLong();
			if(a1*b2 - a2*b1 < 0){
				flag = 0;
			}
			else{
				flag = 1;
			}
			long x,y;
			if(flag == 0){
				y = 0;
				while((a2*y-a1*b2+a2*b1)%b2 != 0){
					++y;
				}
				x = (a2*y-a1*b2+a2*b1)/b2;
			}
			else{
				x = 0;
				while((b2*x+a1*b2-a2*b1)%a2 != 0){
					++x;
				}
				y = (b2*x+a1*b2-a2*b1)/a2;
			}
			a1 += x;
			b1 += y;
			/*total = total + x + y;
			System.out.print('(');
			System.out.print(x);
			System.out.print(',');
			System.out.print(y);
			System.out.println(')');*/
		}
		System.out.println(total);
	}
}
