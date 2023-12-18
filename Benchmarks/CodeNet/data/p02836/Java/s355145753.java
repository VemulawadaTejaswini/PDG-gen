import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String S = sc.next();
        for(int i=0; i<(int)S.length()/2; i++){
            if(S.charAt(i) != S.charAt(S.length()-i-1)){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
