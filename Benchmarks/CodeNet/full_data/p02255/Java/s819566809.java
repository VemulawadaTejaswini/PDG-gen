import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for(int i = 0,n = a.length;i < n;i++) a[i] = sc.nextInt();
        print(a);
        insertSort(a);
        sc.close();
    }

    private static void insertSort(int[] a){
        for(int i = 1,l = a.length;i < l;i++){
            int v = a[i],j = i - 1;
            while(j >= 0 && a[j] > v){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
            print(a);
        }
    }

    private static void print(int[] a){
        System.out.print(a[0]);
        for(int k = 1,l = a.length;k < l;k++) System.out.print(" " + a[k]);
        System.out.println();
    }

}