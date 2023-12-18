import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new StringBuilder(sc.nextLine()).reverse().toString();
        sc.close();

        String[] t = {"dream", "dreamer", "erase", "eraser"};
        StringBuilder[] sb = new StringBuilder[t.length];
        for(int i=0; i<t.length; i++) {
            sb[i] = new StringBuilder(t[i]);
        }

        for(StringBuilder str: sb) {
            if(s.contains(str.reverse().toString())) {
                s = s.replace(str.toString(),"");
            }
        }

        if(s.length() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
