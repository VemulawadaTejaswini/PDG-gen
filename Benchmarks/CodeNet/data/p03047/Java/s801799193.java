import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int a = n/r;
        int bb = n/g;
        int c = n/b;
        int sum=0;
        int I = 0;
        int J = 0;
        int K = 0;
        for(int i = 0;i<=a;i=i*2){
            for(int j=0;j<=bb;j=j*2){
                for (int k=0;k<=c;k=k*2){
                    int goukei =(r*i)+(g*j)+(b*k);
                    if(goukei==n){
                        I = I + i;
                        J = J + j;
                        K = K + k;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}