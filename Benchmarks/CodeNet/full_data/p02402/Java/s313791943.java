import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long p;
        int x=sc.nextInt();
        long a=1000000;
        long b=-1000000;
        long c=0;
        for(int i=0;i<=x;i++){
            p=sc.nextLong();
            if(p<a){
                a=p;
            }
            if(p>b){
                b=p;
            }
            c=c+p;
        }
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.print(c);
    }
}

