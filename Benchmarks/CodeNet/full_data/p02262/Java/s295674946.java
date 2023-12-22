import java.util.Scanner;
import java.util.Vector;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        shellSort(a, a.length);
    }

    static Vector<Integer> ve = new Vector<Integer>();
    static long cut=0;

    private static void shellSort(int[] a, int length) {
        int h=1;
        while(h<length){
            ve.add(h);
            h=3*h+1;
        }
        for (int i=ve.size()-1;i>=0;i--){
           insertSort(a,length,(Integer)ve.get(i));
        }
        System.out.println(ve.size());
        for (int  i= ve.size()-1;i>=0;i--){
            System.out.print(ve.get(i)+" ");
        }
        System.out.println("\n"+cut);
        for (int i=0;i<a.length-1;i++){
            System.out.println(a[i]);
        }
        System.out.print(a[a.length-1]);
    }

    private static void insertSort(int[] a, int length, Integer n) {
        for(int i=0;i<n;i++){
            for (int j=i+n;j<length;j=j+n){
                int m= a[j];
                int l =j-n;
                while (l>=i&&a[l]>m){
                    a[l+n]=a[l];
                    l-=n;
                    cut++;
                }
                a[l+n]=m;
            }
        }
    }
}

