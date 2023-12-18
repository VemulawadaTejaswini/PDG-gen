import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = input.charAt(0);
        
        switch(c) {
        case 'A':
            System.out.println('T');
            break;
        case 'C':
            System.out.println('G');
            break;
        case 'G':
            System.out.println('C');
            break;
        case 'T':
            System.out.println('A');
            break;
        default:
            break;
        }
        
        
    }
}
