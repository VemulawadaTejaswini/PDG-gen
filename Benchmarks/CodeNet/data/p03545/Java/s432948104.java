import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int A = Integer.valueOf(N.substring(0,1));
        int B = Integer.valueOf(N.substring(1,2));
        int C = Integer.valueOf(N.substring(2,3));
        int D = Integer.valueOf(N.substring(3,4));
        String op[][] = new String[][]{
            {"+", "+", "+"},
            {"+", "+", "-"},
            {"+", "-", "+"},
            {"-", "+", "+"},
            {"+", "-", "-"},
            {"-", "+", "-"},
            {"-", "-", "+"},
            {"-", "-", "-"},
        };
        for(int i = 0; i < op.length; i++){
            int tmp;
            if(op[i][0].equals("+")) {
                tmp = A + B;
            }else {
                tmp = A - B;
            }

            if(op[i][1].equals("+")) {
                tmp = tmp + C;
            }else {
                tmp = tmp - C;
            }

            if(op[i][2].equals("+")) {
                tmp = tmp + D;
            }else {
                tmp = tmp - D;
            }

            if(tmp == 7) {
                System.out.println(A+op[i][0]+B+op[i][1]+C+op[i][2]+D+"=7");
                return;
            }
        }


    }
}