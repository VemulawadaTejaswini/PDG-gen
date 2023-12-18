import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();

        int count = 0;

        for(int i=0; i<n; i++) {
            char ai = a.charAt(i);
            char bi = b.charAt(i);
            char ci = c.charAt(i);
            if(ai==bi && bi==ci) {
                // non
            }else if(ai != bi && ai != ci && bi != ci) {
                count += 2;
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}
