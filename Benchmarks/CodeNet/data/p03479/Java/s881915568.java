import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan =new Scanner(System.in);
		long x=Long.parseLong(scan.next());
		long y=Long.parseLong(scan.next());
		long coppy_x=x;
		long count=0;
		while (x<=y){
			++count;
			x*=2;
		}
		System.out.print(count);
	}
}
//end
