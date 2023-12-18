import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String res = "Yes";
        
        if(N % 2 == 1){
            res = "No";
        }else{
            for(int i = 0;i < N / 2;i++){
                if(S.charAt(i) != S.charAt(N/2+i)){
                    res = "No";
                }
            }
            
        }
        System.out.println(res);
    }
}
