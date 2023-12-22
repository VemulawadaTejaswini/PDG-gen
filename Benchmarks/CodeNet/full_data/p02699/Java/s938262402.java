import java.util.*;
public class main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int w = scan.nextInt();
		if(w>=s){
			System.out.println("unsafe");
		}
		else{
			System.out.println("safe");
		}
	}
}