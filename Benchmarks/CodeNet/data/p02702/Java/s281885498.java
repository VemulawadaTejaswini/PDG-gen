import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] sp = S.split("");
        int N = sp.length;
        int count = 0;

        for(int i = 0; i < N; i++) {
            int a = 0;
            for(int j = i + 4; j <= N; j++) {
                if(j - i < 5) {
                    a = Integer.parseInt(S.substring(i, j));
                    if(a % 2019 == 0) {
                        count++;
                    }
                }else {
                    String str = S.substring(i, j);

                    while(str.length() < 5) {
                        int ichi = Integer.parseInt(str.substring(str.length()-1)) * 1817;
                        str = str.substring(0, str.length()-2);
                        int amari = Integer.parseInt(str.substring(str.length()-6));
                        amari -= ichi;
                        str = str.substring(0,str.length()-6) + Integer.toString(amari);
                        System.out.println(str);
                    }
                    
                    if(Long.parseLong(str) % 2019 == 0) {
                        count++;
                    }
                    
                }
            }
            
        }
        
        System.out.println(count);
        
        
    }
}