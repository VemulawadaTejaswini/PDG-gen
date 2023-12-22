import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        int K = sc.nextInt(),A = sc.nextInt(),B = sc.nextInt();
        if((B - A) >= K) System.out.println("OK");
        else if(B == A){
                if(B % K == 0)System.out.println("OK");
                else System.out.println("NG");
        }else if(B % K == 0)System.out.println("OK");
        else{ 
            System.out.println("NG");    
        }
        
    }
}






