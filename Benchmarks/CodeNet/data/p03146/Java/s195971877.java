import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */
import java.util.*;
import java.io.*;

public class Main {
    public static int collatz(int n){
        if(n%2==0) return n/2;
        else return 3*n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Set<Integer> appeared = new HashSet<>();
        appeared.add(s);
        for(int m=2; m<1000000; m++){
            s = collatz(s);
            if(appeared.contains(s)){
                System.out.println(m);
                return;
            }else{
                appeared.add(s);
            }
        }


    }
}
