import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> visited = new HashSet<>();
        for(char c : str.toCharArray()) {
          if(visited.contains(c)) {
            System.out.println("no");
            return;
          }
          visited.add(c);
        }
        System.out.println("yes");
    }
}