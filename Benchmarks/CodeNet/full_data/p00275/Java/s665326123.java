import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int n=sc.nextInt();
            if(n==0) {
                break;
            }
            int[] l=new int[n];
            int t=0;
            char[] c=sc.next().toCharArray();
            for(int i=0;i<100;i++) {
               if(c[i]=='S') {
                   t+=l[i%n]+1;
                   l[i%n]=0;
               }else if(c[i]=='L') {
                   l[i%n]+=t+1;
                   t=0;
               }else {
                   l[i%n]++;
               }
            } 
            Arrays.sort(l);
            for(int i=0;i<n;i++) {
                System.out.print(l[i]+(i==n-1?(" "+t+"\n"):" "));
            }
        }
    }
}
