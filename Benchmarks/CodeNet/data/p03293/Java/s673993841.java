import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String N =sc.next();
        String T =sc.next();
        
        for(int i=0;i<N.length();i++){
            if(N.equals(T)){
                System.out.println("Yes");
            }
            N=N.substring(N.length()-1, N.length())+N.substring(0,N.length()-1);
        }
        
        System.out.println("No");
        
        
        
        
        
    }
}
