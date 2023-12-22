import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
//			int a[] = new int[2];
//			int b[] = new int[2];
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) {
				break;
			}
			if(a > b) {
				System.out.printf("%d %d\n",a,b);
			}else {
				System.out.printf("%d %d\n",b,a);
			}
			
		}
		
	}

}

