import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
//        List<Integer> list = new ArrayList<Integer>();
//        List<Integer> lo = new ArrayList<Integer>();
        int B = sc.nextInt();
        
        if(A+B >= A-B && A+B >= A+B) {
            System.out.println(A+B);
        }
        if(A-B >= A*B && A-B >= A*B) {
            System.out.println(A-B);
        }
        if(A*B >= A+B && A*B >= A-B) {
            System.out.println(A*B);
        }

    }
}
