import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		for(int i=1;;i++){
			int x=new Scanner(System.in).nextInt();
			if(x==0) break;
			System.out.println("Case "+i+": "+x);
		}
	}
}