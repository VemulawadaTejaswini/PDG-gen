import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc;
		int x=1;
		for(int i=1;x!=0;i++){
			sc=new Scanner(System.in);
			x=sc.nextInt();
			if(x!=0) System.out.println("Case "+i+": "+x);
		}
	}
}