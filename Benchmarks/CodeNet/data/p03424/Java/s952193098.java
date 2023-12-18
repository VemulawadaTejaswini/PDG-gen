import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashSet<Character> hashSet = new HashSet<>();


        for(int i=0; i<N; i++){
            String S = scanner.next();
            hashSet.add(S.charAt(0));
        }

        if(hashSet.size() == 3) {
            System.out.println("Three");
        }else{
            System.out.println("Four");
        }
    }
}
