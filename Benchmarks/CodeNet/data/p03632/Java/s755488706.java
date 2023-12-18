import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int D = sc.nextInt();

                if(A<=C && C<=B) {
			System.out.println(B-C);
		}
                else if(C<=A && A<=D){
			System.out.println(D-A);
		}
                else{
                       System.out.println("0");
                }
	}
}