import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int index = 0;
        for (int i = 0; i < n; i++) {
            int a  = sc.nextInt();
            if (a == 1) {
                index = i;
            }
        }


        int left = (index - 1);
        int amari = left % (k-1) == 0 ? 0 : 1;
        int lCount = left/ (k-1) + amari;

        int right = (n - index);
        int amari2 = right % (k-1) == 0 ? 0 : 1;
        int rCount = right/ (k-1) + amari2;

        System.out.println(lCount + rCount);
    }

}