import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0; i<M; i++){
            System.out.println(i + 1 + " " + (int)(N - i));
        }
    }
}