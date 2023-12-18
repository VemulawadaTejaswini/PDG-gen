import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = 0;	
		for(int i = 0; i<N ; i++) {
			tmp=tmp+i;
		}
      	System.out.println(tmp);
	}
}