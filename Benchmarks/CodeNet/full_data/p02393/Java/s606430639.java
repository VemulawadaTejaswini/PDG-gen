import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        int work;
        int[] x = new int[3];
         
        for (i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }
         
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x.length-1 - i; j++) {
                if (x[j] > x[j+1]) {
                    work = x[j];
                    x[j] = x[j+1];
                    x[j+1] = work;
                }
            }
        }
         
        for (i = 0; i < x.length; i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.print(x[i]);
        }
        System.out.print("\n");
        scanner.close();
    }
}
