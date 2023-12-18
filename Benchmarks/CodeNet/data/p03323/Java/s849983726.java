import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int[] cake = new int[15];

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        for (int i = 0; i < 15; i++) {
            if (A != 0 && B != 0) {
                if (i % 2 == 0) {
                    cake[i] = 1;
                    A--;
                } else {
                    cake[i] = 2;
                    B--;
                }
            } else if (A == 0 && B != 0) {
                cake[i] = 2;
                B--;
            } else if (A != 0 && B == 0) {
                cake[i] = 1;
                A--;
            } else if (A == 0 && B == 0) {
                System.out.println("Yay!");
                break;
            }
        }

        if(A != 0 || B != 0){
            System.out.println(":(");
        }
    }
}