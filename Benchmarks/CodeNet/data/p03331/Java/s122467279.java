import java.util.*;

class Main{
    static int digitsum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

       int min = 100000;
       for(int i = 1; i <= N - 1; i++){
           min = Math.min(min, digitsum(i) + digitsum(N - i));
       }

       System.out.println(min);
    }
}
