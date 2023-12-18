import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        inp.close();
        System.out.println(s.replaceAll("2017", "2018"));
    }
}