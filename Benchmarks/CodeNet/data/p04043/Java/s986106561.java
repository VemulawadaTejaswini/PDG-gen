import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//javadoc JREはjavadoc
        int b = sc.nextInt();
        int c = sc.nextInt();
        
		Judgment(a, b, c);
        
    }
    
    static void Judgment(int a, int b, int c) {
    	if (a == 5 && b == 7 && c == 5) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
    }
}