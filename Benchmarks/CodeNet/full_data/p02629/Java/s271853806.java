import java.util.*;

public class Main {


    public static void main(String[] args) {

        //1_000_000_000_000_001    15


        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();


        StringBuilder sb = new StringBuilder();

        while(N>0){
            int m = (int)(N %26L);
            char c = (char)('a'+ m-1);
            sb.insert(0,c);
            N = N/26L;
        }
        System.out.println(sb.toString());


    }

}
