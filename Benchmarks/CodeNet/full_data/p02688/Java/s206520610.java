import java.util.HashSet;
import java.util.Scanner;

public class A {

    static long ans;
    static int[] k_list;

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var n = scaner.nextInt(); // sunuke
        var k = scaner.nextInt(); // kind

        var set = new HashSet<>();
        
        for(int i = 0; i<k; i++) {
            int d = scaner.nextInt();
            for(int j = 0; j<d; j++) {
                set.add(scaner.nextInt());
            }
        }

        System.out.println(n - set.size());
        scaner.close();
    }

}
