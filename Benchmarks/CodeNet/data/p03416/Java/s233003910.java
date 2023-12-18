import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int res = 0;
        
        loop: for(int i = a; i <= b; i++){
            String s = String.valueOf(i);
            
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) != s.charAt(s.length()-1-j)){
                    continue loop;
                }
            }
            res++;
        }
        System.out.println(res);
    }
}
