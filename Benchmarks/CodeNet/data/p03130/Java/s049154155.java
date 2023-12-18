import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //        int k = sc.nextInt();
        //        ArrayList<Integer> list = new ArrayList<Integer>();
        //
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
 
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
 
            if (num == 1) {
                c1++;
            } else if (num == 2) {
                c2++;
            } else if (num == 3) {
                c3++;
            } else {
                c4++;
            }
 
            num = sc.nextInt();
 
            if (num == 1) {
                c1++;
            } else if (num == 2) {
                c2++;
            } else if (num == 3) {
                c3++;
            } else {
                c4++;
            }
 
            if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3) {
                System.out.println("NO");
                return;
            }
        }
 
        sc.close();
 
        System.out.println("YES");
 
    }
}