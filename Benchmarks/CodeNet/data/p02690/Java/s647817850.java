import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int A = 0;
        int B = 0;
        double x = Math.pow(N, 1/5);
        A = (int)Math.pow((N - x), 0.2);
        B = -((int)x);
        System.out.printf("%d %d", A, B);
    }
}