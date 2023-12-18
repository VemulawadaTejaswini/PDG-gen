import java.util.*;

public class Main {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char b = scan.next().charAt(0);
        
        char[] c = new char[128];
        c['A'] = 'G';
        c['G'] = 'A';
        c['C'] = 'T';
        c['T'] = 'C';
        
        System.out.println(c[b]);
    }
}
