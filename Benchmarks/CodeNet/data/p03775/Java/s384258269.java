import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int min = Integer.MAX_VALUE;
        for(int i=1;i<Math.sqrt(n)+1;i++){
            if(n%i==0){
                min = Math.min(min,f(i,n/i));
            }
        }
        System.out.println(min);
    }

    private static int f(long a,long b){
        return Math.max(digit(a),digit(b));
    }

    private static int digit(long n){
        int i=1;
        while(true){
            if(n<10)return i;
            i++;
            n=n/10;
        }
    }

}
