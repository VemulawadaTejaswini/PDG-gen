import java.util.Scanner;

public class Main {
    int fact(int n){
        return n == 1 ? 1 : n * fact( n-1 );
    }
    int selection(int n){
        if(n==0 || n==1)
            return 0;
        else{
            int k=fact(n);
            int l=fact(n-2);
            int m=fact(2);
            int p=k/(l*m);

            return p;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        Main ob1=new Main();
//        ob1.selection(N);
        System.out.println(ob1.selection(N) + ob1.selection(M));
    }
}
