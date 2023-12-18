import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String S = scanner.next();
            char[] chArray = S.toCharArray();
            int K=1;
            char c=chArray[0];
            for (int i=1; i<S.length(); i++){
                if (c==chArray[i]){
                    K++;
                } else {
                    c=chArray[i];
                    K=1;
                }
            }
            System.out.println(K);
        }
        
}