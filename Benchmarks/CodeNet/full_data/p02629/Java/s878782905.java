import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        char c = 'a';
        String ans ="";

        boolean f = true;
        int i = 1;

        if(n<=26l){
            ans += (char)(c+n-1);
            f = false;
        }

        while(f){
            c = 'a';
            int k = fKisu(n);
            int t = fTaisu(n,k);
            n = (long) (n - Math.pow(26,k)*t);
            ans += (char)(c+t-1);
            if(n<=26l){
                ans += (char)(c+n-1);
                f = false;
            }
        }
        System.out.println(ans);

    }

    static int fKisu(long n){
        int i = 1;
        while(true){
            if(n<Math.pow(26,i)){
                return --i;
            }
            i++;
        }
    }

    static int fTaisu(long n,long k){
        int i = 1;
        while(true){
            if(n<Math.pow(26,k)*i){
                return --i;
            }
            i++;
        }
    }

}