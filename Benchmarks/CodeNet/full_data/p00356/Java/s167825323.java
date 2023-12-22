import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
                
        int A = a;
        int B = b;
        while(A%B != 0){
            int C = A;
            A = B;
            B = C % A;
            
        }System.out.println( a + b - B + 1);
}
}
