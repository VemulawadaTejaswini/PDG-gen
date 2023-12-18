import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '#') {
                for(int j = i + 1; j < n; j++) {
                    if(s.charAt(j) == '.') count++;
                }
                break;
            }
        }
        System.out.println(count);
    }
}