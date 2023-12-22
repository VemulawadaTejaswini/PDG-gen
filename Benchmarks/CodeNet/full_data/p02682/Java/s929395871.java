import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        long k = s.nextLong();
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
