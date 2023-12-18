import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> a = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            a.add(scanner.next());
        }

        System.out.println(a.size() == n ? "YES" : "NO");
    }

}