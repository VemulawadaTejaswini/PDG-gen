import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<Integer>();
        if(n == k){
            for(int i = 0; i < n; i++){
                if(i == n-i){
                    System.out.print(s);
                }else{
                    System.out.print(s+" ");
                }
            }
        }else{
            int prt = 0;
            for(int i = 0; i < n; i++){
                if(i > k){
                    prt = s+1;
                }else if(i % 2 == 0){
                    prt = 1;
                }else{
                    prt = s-1;
                }
                if(i == n){
                    System.out.print(prt);
                }else{
                    System.out.print(prt+" ");
                }
            }
        }
    }
    
}