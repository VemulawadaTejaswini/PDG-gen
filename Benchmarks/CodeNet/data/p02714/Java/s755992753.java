import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int n = sc.nextInt();
                String s = sc.next();
                sc.close();
                long yono = 0;
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j < i ; j++){
                                for(int k = 0 ; k < j ; k++){
                                        if(j - i != k - j){
                                                if(s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k)) yono++;
                                        }
                                }
                        }
                }
                System.out.println(yono);
        }
}