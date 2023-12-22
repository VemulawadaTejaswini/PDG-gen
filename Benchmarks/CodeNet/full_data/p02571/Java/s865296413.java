import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = new char[S.length()];
        char[] t = new char[T.length()];
        int max = 0;
        for(int i=0;i<S.length();i++){
            s[i] = S.charAt(i);
        }
        for(int i=0;i<T.length();i++){
            t[i] = T.charAt(i);
        }
        if(S.length() == T.length()){
            int count = 0;
            for(int j=0;j<T.length();j++){
                if(s[j] == t[j]){
                    count++;
                }
            }
            System.out.println(T.length() - count);
            return;
        }
        for(int i=0;i<S.length()-T.length();i++){
            int count = 0;
            for(int j=0;j<T.length();j++){
                if(s[i+j] == t[j]){
                    count++;
                }
            }
            if(count > max)max = count;
        }
        System.out.println(T.length() - max);
    }
}