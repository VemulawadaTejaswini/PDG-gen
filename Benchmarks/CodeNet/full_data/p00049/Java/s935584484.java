import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int ab = 0;
        int o = 0;
        String line;
        while(true) {
            try {
                line = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            String[] linesp = line.split(",");
            int x = Integer.parseInt(linesp[0]);
            String blood = linesp[1];
            if(blood.equals("A")) {
                a++;
            }else if(blood.equals("B")) {
                b++;
            }else if(blood.equals("AB")) {
                ab++;
            }else if(blood.equals("O")) {
                o++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(ab);
        System.out.println(o);
    }
}

