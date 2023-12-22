import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int j;
		for(int i=1;;i++){
			j = scan.nextInt();
			if(j==0)break;
			System.out.println("Case "+i+": "+j);
		}
	}
}