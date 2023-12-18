import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=M/N; i>=1; i--){
            if(M%i==0){
                System.out.println(i);
                return;
            }
        }
    }
}