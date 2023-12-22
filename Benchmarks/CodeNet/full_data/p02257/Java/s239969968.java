import java.util.*;
//import java.util.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n];
    int i;
    int count = 0;
    
    for(i = 0; i < n; i++){
        A[i] = sc.nextInt();
//        System.out.println(isprime(A[i]));
        if(isprime(A[i]) == true){
            count++;
        }
    }
 
    System.out.println(count);
    
    }
    
    public static boolean isprime(int x){
        int i = 0;
       // System.out.println(x);
        if(x == 2){
            return true;
        }else if((x % 2) == 0){
            return false;
        }else{
            i = 3;
            while(i <= Math.sqrt(x)){
                if((x % i) == 0){
                    return false;
                }
                i = i + 2;
            }
        }
        return true;
    }
}

