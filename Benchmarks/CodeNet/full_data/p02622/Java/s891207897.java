import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        if(S.equals(T)){
            System.out.println(0);
        } else {
            String[] sArray = new String[S.length()];
            String[] tArray = new String[T.length()];
            int count = 0;
            for(int i = 0;i < S.length();i++){
                sArray[i] = S.substring(i, i+1);
            }
            for(int i = 0;i < T.length();i++){
                tArray[i] = T.substring(i, i+1);
            }
            for(int i = 0;i < T.length();i++){
                if(!sArray[i].equals(tArray[i])){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
