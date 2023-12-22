import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNext()) {
            String[] vals = scn.next().split("[+|=]");
            int i = 0;
            while(i < 10) {
                String num = String.valueOf(i);
                int a = Integer.parseInt(vals[0].replaceAll("X", num));
                int b = Integer.parseInt(vals[1].replaceAll("X", num));
                int c = Integer.parseInt(vals[2].replaceAll("X", num));
                if(a + b == c) {
                    break;
                }
                i++;
            }
            System.out.println(i < 10 ? i : "NA");
        }
    }
}