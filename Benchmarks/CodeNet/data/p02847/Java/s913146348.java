import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] a = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for(int i=0; i<7; i++) {
            if(a[i].equals(s)) {
                System.out.println(7-i);
            }
        }
    }
}
