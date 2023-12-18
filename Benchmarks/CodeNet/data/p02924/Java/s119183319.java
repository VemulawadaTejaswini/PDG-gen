import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 0;	
		for(int i = 0; i<N ; i++) {
			i=i+i;
		}
      	System.out.println(i);
	}
}