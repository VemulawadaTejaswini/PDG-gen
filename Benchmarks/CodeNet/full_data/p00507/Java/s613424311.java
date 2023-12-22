import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] l=new int[n];
        for(int i=0;i<n;i++) {
            l[i]=sc.nextInt();
        }
        Arrays.sort(l);
        String[] a=new String[2];
        int k=0;
        for(int i=0;i<Math.min(2,n);i++) {
            for(int j=0;j<Math.min(2,n);j++) {
                if(i==j)continue;
                a[k++]=l[i]+""+l[j];
            }
        }
        System.out.println(a[1]);
    }
}
