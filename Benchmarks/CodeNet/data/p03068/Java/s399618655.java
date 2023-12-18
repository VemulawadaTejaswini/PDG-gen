import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String S = sc.next();
            int K = sc.nextInt();
        sc.close();
        
        String[] text = new String[N];
        for (int i = 0; i < N; i++) {
            text[i] = String.valueOf(S.charAt(i));
        }
        
        String rep = text[K-1];

        String ans = "";
        for (int i = 0; i < N; i++) {
            if(!rep.equals(text[i])){
                text[i] = "*";
                ans = ans + text[i];
            }else{
                ans = ans + text[i];
            }
         }

         System.out.println(ans);

    }
}