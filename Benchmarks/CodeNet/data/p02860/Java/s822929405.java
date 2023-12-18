
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String s = S.substring(0,N/2) + S.substring(0,N/2);
        if(N%2 == 1) {
            System.out.println("No");            
        }else if(S.equals(s)) {
            System.out.println("Yes");
        }else {

            System.out.println("No");
        }
    }
}
