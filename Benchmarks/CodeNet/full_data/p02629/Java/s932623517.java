import java.util.*;

public class Main {



    public static void main(String[] args) {

        //1_000_000_000_000_001    15


        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();


        StringBuilder sb = new StringBuilder();

        boolean exit = false;
        while(!exit){
            int m = (int)(N %26L);
            if(m==0){
                char c = (char)('a'+ 25);
                sb.insert(0,c);
                N = N/26L;
                if(N ==1L) exit=true;
            }else{
                char c = (char)('a'+ m-1);
                sb.insert(0,c);
                N = N/26L;
                if(N ==0L) exit=true;
            }
        }
        System.out.println(sb.toString());


    }

}
