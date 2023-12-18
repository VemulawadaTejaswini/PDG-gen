import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long a = s.nextInt();
        long b = s.nextInt();
        long c = s.nextInt();
        long k = s.nextLong();
        if(a == k){
            System.out.println(a);
            System.exit(0);
        }
        else if(a+b == k){
            System.out.println(a);
            System.exit(0);
        }
        long res = 0;
        while(k-- >0){
            if(a > 0){
                res++;
                a--;
            }
            else if(b > 0){
                b--;
            }
            else if(c > 0){
                res--;
                k--;
            }
        }
        System.out.println(res);
    }
}
