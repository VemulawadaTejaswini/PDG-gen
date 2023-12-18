import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        char[] s = sc.next().toCharArray();
        long q = sc.nextLong();
        
        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            if(a == 1){
                int b = sc.nextInt();
                char[] c = sc.next().toCharArray();
                
                s[b-1] = c[0];
            }else{
                int b = sc.nextInt();
                int c = sc.nextInt();
                
                HashSet<Character> hs = new HashSet<Character>();
                
                for(int j = b-1; j < c; j++){
                    hs.add(s[j]);
                }
                
                System.out.println(hs.size());
            }
        }
    }
}