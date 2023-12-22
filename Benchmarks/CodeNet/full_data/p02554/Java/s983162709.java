import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   int     N = scan.nextInt();
   long a=1;
        long b=1;
       long c=1;
        for(int i=0;i<N;i++){
            a=(a*10)%1000000007;
            b=(b*9)%1000000007;
            c=(c*8)%1000000007;

        }
   a=a-2*b+c;
        while(a<0){a=a+1000000007;}
        System.out.println(a);
    }
}
