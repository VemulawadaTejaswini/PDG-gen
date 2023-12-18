import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m[]=new int[200000001];
       int a=sc.nextInt();
       int flag=0;
       for(int i=0;i<a;i++){
           int p=sc.nextInt();
           m[p]++;
           if(m[p]>=2)
               flag=1;
       }
       if(flag==1)
           System.out.println("NO");
       else
           System.out.println("YES");


    }
}
