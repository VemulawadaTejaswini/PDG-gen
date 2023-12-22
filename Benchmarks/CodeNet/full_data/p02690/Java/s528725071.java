
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Long X = sc.nextLong();

		Long a = (long) Math.floor(Math.sqrt(X));

		while(true){
			if(X%a==0){
				Long ans = calc(X,a);
				if(ans!=0){
					System.out.println((ans+a) + " " + ans);
					return;
				}
			}
			a--;
		}
	}

	public static Long calc(Long target, Long a){

		Long b = (long) 1;

		while(true){
			Long A = (long) Math.pow(b,5);
			Long B = (long) Math.pow(a+b,5);
			boolean bl = false;
			if(B-A>target){
				bl = true;
			}
			if(B-A==target){
				return b;
			}

			B = (long) Math.pow(a-b,5);
			if(bl&&(B+A>target)){
				return (long) 0;
			}
			if(B+A==target){
				return -b;
			}
			
			b++;
		}
	}
}
