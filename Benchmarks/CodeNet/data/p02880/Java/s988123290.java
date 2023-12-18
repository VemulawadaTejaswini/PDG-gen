import java.util.*;
import java.lang.*;


public class Main {
    static boolean solve(int N){
        for(int a=1; a<10; a++) for(int b=1; b<10; b++){
            if(a*b==N){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solve(N) ? "Yes" : "No");
    }
}
