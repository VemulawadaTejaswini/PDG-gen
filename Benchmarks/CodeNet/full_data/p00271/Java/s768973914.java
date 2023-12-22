import java.util.*;
public class Main{
	public void output(){
		Scanner scan = new Scanner(System.in);
		for(int i = 1;i <= 7;i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a-b);
		}
	}
}