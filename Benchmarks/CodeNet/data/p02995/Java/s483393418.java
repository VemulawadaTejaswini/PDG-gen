import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long min = 0;
        int j = 0; //c:1 d:-1
        long count = 0;

        for(long i = a; i <= b; i++){
            if(i % c == 0){
                if(i % d == 0) count++;
                min = i;
                j = 1;
                break;
            }
            else if(i % d == 0){
                if(i % c == 0) count++;
                min = i;
                j = -1;
                break;
            }
        }
        if(j == 1){
            for(long i = min; i <= b; i += c){
                if(i % d == 0) count++;
            }
        }
        else if(j == -1){
            for(long i = min; i <= b; i += d){
                if(i % c == 0) count++;
            }
        }
        if(a % c == 0) count--;
        if(a % d == 0) count--;

        // 出力
        System.out.println(b - a + 1 - (b / c - a / c + b / d - a / d) + count);

    }

}