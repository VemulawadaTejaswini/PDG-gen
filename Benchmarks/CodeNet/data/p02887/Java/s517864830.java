import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        char c = s.charAt(0);
        int res = 0;
        
        for(int i = 1; i < n; i++){
            if(s.charAt(i) != c){
                res++;
                c = s.charAt(i);
            }
        }
        
        System.out.println(res+1);
    }
}
