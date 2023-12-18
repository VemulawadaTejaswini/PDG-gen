import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        char b = inp.next().toCharArray()[0];
        if (b == 'A') System.out.println('T');
        if (b == 'T') System.out.println('A');
        if (b == 'C') System.out.println('G');
        if (b == 'G') System.out.println('C');
        inp.close();
    }
}
