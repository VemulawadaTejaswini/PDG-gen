import java.util.Scanner;
public class Main {
    public int bubbleSort (int[] a, int n) {
        int tmp, sw = 0;
        boolean flag = true;
        for(int i = 0 ; flag ; i++) {
            flag = false;
            for(int j = n-1 ; j >= i+1 ; j--) {
                if (a[j] < a[j-1]) {
                    tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    flag = true;
                    sw++;
                }
            }
        }
        return sw;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int len, m = 0;
        len = sc.nextInt();
        int[] b = new int[len];
        for (int i = 0 ; i < len ; i++) {
            b[i] = sc.nextInt();
        }
        m = main.bubbleSort(b, len);
        for (int j = 0 ; j < len ; j++) {
            if(j != 0) System.out.print(" ");
            System.out.print(b[j]);
        }
        System.out.println();
        System.out.println(m);
    }
}
