import java.util.*;


class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n-2;i++){
            int a=p[i];
            int b=p[i+1];
            int c=p[i+2];
            if(a<b && b<c)count++;
            if(a>b && b>c)count++;
        }
        System.out.println(count);
    }
}