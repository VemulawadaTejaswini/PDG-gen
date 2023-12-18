
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a=scan.nextLong();
		long ans=0;
		long b=scan.nextLong();
		long jn=(long) Math.sqrt(b);
		for(;;) {
			long kari=b;
				for(int j=1;;j++) {
					if(kari%jn!=0) {break;}
					kari/=jn;
					if(j==a) {ans=jn;break;}
				}
			jn--;
			if(ans!=0) {break;}
		}
		System.out.println(ans);
    }
}