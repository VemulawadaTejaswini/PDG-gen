import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
    
        List<String> array = new ArrayList<>();
        for (int i=0; i<N; i++) {
            array.add(String.valueOf(S.charAt(i)));
            array.add(String.valueOf(T.charAt(i)));
        }
        
        String result = String.join("", array);
        System.out.println(result);
    
    }
}