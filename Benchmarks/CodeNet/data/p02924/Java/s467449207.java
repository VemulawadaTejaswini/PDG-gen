import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long tmp = 0;	
		for(int i = 0; i<N ; i++) {
			tmp=tmp+i;
		}
      	System.out.println(tmp);
	}
}