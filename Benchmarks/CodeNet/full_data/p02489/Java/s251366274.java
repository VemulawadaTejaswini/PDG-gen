import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		for(int i = 1;;i++){
			if(x == 0)break;
			System.out.println("Case "+i+": "+x);
			x = sc.nextInt();
		}
	}

}