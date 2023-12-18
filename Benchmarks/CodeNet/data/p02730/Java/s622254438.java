import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int N=S.length();
        
        for(int i=0;i<(N-3)/2;i++){
            if(S.charAt(i)==S.charAt((N-3-2*i)/2)){
                
            }else{
                System.out.println("No");
                return;
            }
        }
        
        for(int i=0;i<(N-1)/2;i++){
            if(S.charAt((N+1+2*i)/2)==S.charAt(N-1-i)){
                
            }else{
                System.out.println("No");
                return;
            }
        }
        
        for(int i=0;i<N;i++){
            if(S.charAt(i)==S.charAt(N-1-i)){
                
            }else{
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
