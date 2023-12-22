import java.util.*;

public class Main{
//public class abc164_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int w = scan.nextInt();

		
		if(s > w){
			System.out.println("safe");
		}else{
			System.out.println("unsafe");
		}
	}

}