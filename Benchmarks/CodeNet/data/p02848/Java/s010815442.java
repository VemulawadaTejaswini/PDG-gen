import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S =sc.next();
        for(int i=0;i<S.length();i++){
            char a = (char)(((S.charAt(i) - 'A') + N)%26 + 'A');   
            System.out.print(a);
        }
        System.out.println();
    }
}
