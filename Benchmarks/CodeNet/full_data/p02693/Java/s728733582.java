import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean f = false;
        for(int i=A; i<B; i++) {
            if(i%K == 0) {
                f = true;
                break;
            }
        }
        if(f == true) System.out.println("OK");
		else System.out.println("NG");

		
	}
}