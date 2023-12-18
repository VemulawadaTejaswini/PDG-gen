import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();//javadoc JREはjavadoc
        int B = sc.nextInt();
        int C = sc.nextInt();
        
		Judgment(A, B, C);
        
    }
    
    static void Judgment(int A, int B, int C) {
    	if (A == 5 && B == 7 && C == 5) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
    }
}