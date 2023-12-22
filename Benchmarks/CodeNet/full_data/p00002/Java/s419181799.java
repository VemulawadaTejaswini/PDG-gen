import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner inp = new Scanner (System.in);
        int sum = inp.nextInt() + inp.nextInt();
        int digit = (int)(Math.log10(sum)+1);
        System.out.println(digit);
    }
}