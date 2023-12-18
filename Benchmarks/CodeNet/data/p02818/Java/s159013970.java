import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final long takahashi = Long.valueOf(scn.next());
			final long aoki = Long.valueOf(scn.next());
			final long actionCount = Long.valueOf(scn.next());
			
			long ret1,ret2;
			if(takahashi + aoki < actionCount){
			    ret1 = 0;
			    ret2 = 0;
			}else if(takahashi < actionCount){
			    ret1 = 0;
			    ret2 = aoki - actionCount + takahashi;
			}else {
			    ret1 = takahashi - actionCount;
			    ret2 = aoki;
			}
			
		
			System.out.println(ret1+ " " + ret2);
		}
	}
}
