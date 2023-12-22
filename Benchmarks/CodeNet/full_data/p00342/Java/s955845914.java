import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Integer[] l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        l=new Integer[n];
        for(int i=0;i<n;i++) {
            l[i]=sc.nextInt();
        }
        Arrays.sort(l,Comparator.reverseOrder());
        double max=Math.max(f(2,3,0,1), f(0,3,1,2));
        for(int i=2;i<n-1;i++) {
            max=Math.max(max, f(0,1,i,i+1));
        }
        System.out.printf("%5f",max);
    }
    static double f(int a,int b,int c,int d) {
        return (double)(l[a]+l[b])/(double)(l[c]-l[d]);
    }
}
