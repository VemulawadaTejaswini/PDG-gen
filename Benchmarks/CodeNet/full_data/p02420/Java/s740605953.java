import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> al = new ArrayList<>();
        while(true) {
            String s1 = sc.next();
            if(s1.equals("-")) {
                break;
            }
            int a = sc.nextInt();
            String s2 = null;
            String s3 = null;
            String s4 = s1;
            for(int i =0; i < a; i++) {
                int b = sc.nextInt();
                s2 = s4.substring(0, b);
                s3 = s4.replaceFirst(s2, "");
                s4 = s3.concat(s2);
            }
            al.add(s4);
        }
        for(String s : al) {
            System.out.println(s);
        }
    }
}

