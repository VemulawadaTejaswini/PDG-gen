
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println(even_pairs(scn.nextInt(),scn.nextInt()));
    }
    static int even_pairs(int n, int m){
        return combinationOfTwo(n) + combinationOfTwo(m);
    }
    static  int factorial (int n){
        int nn =n;
        if(n == 0){
            return 1;
        }
        for(int i = 1; i < n; i++){
            nn *= i;
        }
        return  nn;
    }
    static int  combinationOfTwo(int n){
        return factorial(n)/(factorial(n-2)*factorial(2));

    }
}
// 2 4 6 8 10 12 
