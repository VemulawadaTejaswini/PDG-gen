import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        
        char result = '0';
        if (s == 'A') {
            result = 'T';
        } else if (s == 'T') {
            result = 'A';
        } else if (s == 'C') {
            result = 'G';
        } else if (s == 'G') {
            result = 'C';
        }
        
        System.out.println(result);
    }
}
