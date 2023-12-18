import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = Math.abs(inp.nextInt() - 25);
        System.out.println("Christmas" + StringTimes(" Eve", a));
        inp.close();
    }
    public static String StringTimes(String s, int t) {
        String res = "";
        for (int i = 0; i < t; i++) {
            res += s;
        }
        return res;
    }
}
