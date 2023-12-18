import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        if(N % 2 == 0){
            String s1 = S.substring(0, N / 2);
            String s2 = S.substring(N / 2, S.length());
            boolean f = true;
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    f = false;
                    break;
                }
            }
            if(f){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}
