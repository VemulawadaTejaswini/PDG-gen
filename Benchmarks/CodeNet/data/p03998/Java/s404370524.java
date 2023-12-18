import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        ArrayList<String> aa = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            aa.add(a.substring(i, i + 1));
        }
        String b = sc.next();
        ArrayList<String> bb = new ArrayList<>();
        for (int i = 0; i < b.length(); i++) {
            bb.add(b.substring(i, i + 1));
        }
        String c = sc.next();
        ArrayList<String> cc = new ArrayList<>();
        for (int i = 0; i < c.length(); i++) {
            cc.add(c.substring(i, i + 1));
        }
        String s = aa.get(0);
        while(true) {
            if(s.equals("a")) {
                if(aa.size() == 0) {
                    System.out.println("A");
                    return;
                }
                aa.remove(0);
                s = aa.get(0);
            } else if(s.equals("b")) {
                if(bb.size() == 0) {
                    System.out.println("B");
                    return;
                }
                bb.remove(0);
                s = bb.get(0);
            } else if(s.equals("c")) {
                if(cc.size() == 0) {
                    System.out.println("C");
                    return;
                }
                cc.remove(0);
                s = cc.get(0);
            }
        }
    }
}