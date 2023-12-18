import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder A = new StringBuilder();
        for(int i = 0;i < S.length();i++){
            switch (S.charAt(i)) {
                case '0':
                A.append(S.charAt(i));
                break;
                case 'B':
                if(A.length() != 0){
                    A.setLength(A.length()-1);
                }
                break;
                case '1':
                A.append(S.charAt(i));
                break;
            }
        }
        System.out.println(A);
        
    }
}
