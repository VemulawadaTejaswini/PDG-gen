import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //整数の数
        int[] a = new int[n];
        for (int i=0; i<n; i++) { //整数を読み込む
            a[i] = sc.nextInt();
        }
        //シェルソート
        shellSort(a,n);
    }
    /**
     * シェルそーと
     */
    static void shellSort(int[] a, int n) {
        int g=1;
        int m=1;
        int count=0;
        while(3*g+1<n) {
            g=3*g+1;
            m++;
        }
        System.out.println(m);
        while(g>0) {
            count=count+insertionSort(a,n,g);
            System.out.print(g);
            if(g!=1) System.out.print(" ");
            g/=3;
        }
        System.out.println();
        System.out.println(count);
        for(int i=0; i<n; i++) {
            System.out.println(a[i]);
        }
    }
    /**
     * 挿入ソート
     */
    public static int insertionSort(int[] a, int n, int g) {
        int count = 0;
        for (int i=g; i<n; i++) {
            int v = a[i];
            int j = i-g;
            while(j>=0 && a[j]>v) {
                a[j+g] = a[j];
                j-=g;
                count++;
            }
            a[j+g] = v;
        }
        return count;
    }
}
