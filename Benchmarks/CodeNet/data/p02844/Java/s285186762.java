import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        TreeSet<Integer>[] digits = new TreeSet[10];
        for(int d=0; d<10; d++) digits[d] = new TreeSet<>();
        for(int n=0; n<N; n++) digits[S.charAt(n)-'0'].add(n);

        int answer = 0;

        for(int a=0; a<10; a++) for(int b=0; b<10; b++) for(int c=0; c<10; c++){
            try{Integer A = digits[a].first();
                Integer B = digits[b].higher(A);
                Integer C = digits[c].higher(B);
                if(!C.equals(null)) answer++;
            }catch(Exception e){}
        }
        System.out.println(answer);
    }
}
