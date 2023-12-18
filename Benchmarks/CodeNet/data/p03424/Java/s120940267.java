import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S[] = new String[N];
        String count = "Three";
       
        for(int i=0; i<N; i++){
            S[i] = sc.next();   
            if(S[i].equals("Y"))
            count = "Four";
        }

        System.out.println(count);            
    
    }    
}


