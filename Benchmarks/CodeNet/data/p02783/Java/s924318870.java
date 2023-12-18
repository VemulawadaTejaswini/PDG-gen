import java.util.*;

public class Main{
	public static void main(String arg[]){
			Scanner sc = new Scanner(System.in);
			int H = sc.nextInt();
			int n = sc.nextInt();
			int c=1;
			while(true){
				H = H-n;
				if(H <= 0)
					break;	
				c++;
			}
			System.out.println(c);
	}
}