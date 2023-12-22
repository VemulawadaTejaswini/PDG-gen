import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        
        if(M % 2 == 0) {
            for(int i = 1; i <= M/2; i++) {
                System.out.println(i+" "+((N+1)/2-i+1));
            }
            
            for(int i = 1; i <= M/2; i++) {
                System.out.println((i+(N+1)/2)+" "+(N+1-i));
            }
        }else {
            for(int i = 1; i <= (M-1)/2; i++) {
                System.out.println(i+" "+((N+1)/2-i));
            }
            
            for(int i = 0; i < (M+1)/2; i++) {
                System.out.println((i+(N+1)/2)+" "+(N-i));
            }
        }

    }
}