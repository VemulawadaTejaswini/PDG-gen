import java.util.*;
import java.util.Arrays;
public class Main {
    static int i,j;
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[3];
		for(i=0;i<a;i++){
			for(j=0;j<3;j++){
				b[j]=sc.nextInt();
			}
			Arrays.sort(b);
			if((b[0]^2+b[1]^2)==(b[2]^2))
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		

 }
}