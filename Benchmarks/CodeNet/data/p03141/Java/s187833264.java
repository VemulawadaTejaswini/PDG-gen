import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */

class Dish implements Comparable<Dish>{
    long tak, aok;
    public Dish(long tak, long aok){
        this. tak = tak;
        this.aok = aok;
    }

    public int compareTo(Dish another){
        return Long.compare(this.tak+this.aok, another.tak+another.aok);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Dish[] dishes = new Dish[N];
        for(int n=0; n<N; n++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            dishes[n] = new Dish(A,B);
        }

        Arrays.sort(dishes, Collections.reverseOrder());

        long ans = 0;

        for(int n=0; n<N; n++){
            if(n%2==0) ans += dishes[n].tak;
            else ans -= dishes[n].aok;
        }


        System.out.println(ans);




    }
}
