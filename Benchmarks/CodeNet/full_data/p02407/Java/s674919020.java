import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            int tmp = a[i];
            b[i] = a[n - 1 - i];
            a[n - 1 - i] = tmp;
            if(i != 0) System.out.print(" ");
            System.out.print(b[i]);
        }

        System.out.println();
    }
}
