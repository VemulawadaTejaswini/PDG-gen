import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = s.length();
        int [] n = new int [num];
        int [] a1 = new int [num];
        int [] a2 = new int [num];
        int cnt1  = 0;
        int cnt2 = 0;
        if (num == 1) {
            System.out.println("0");
        } else if (num == 2) {
            if (n[0] != n[1]) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            
            for (int i = 0;i<num;i++)  {
                n[i] = Integer.parseInt(s.substring(i,i+1));
                if (0 == (i%2)) {
                    a1[i] = 0;
                    a2[i] = 1;
                } else {
                    a1[i] = 1;
                    a2[i] = 0;
                }
            }
            
            for (int i = 0;i <num;i++){
                if (n[i] !=a1[i]) {
                    cnt1++;
                }
                if (n[i] !=a2[i]) {
                    cnt2++;
                }
            }
            System.out.println(Math.min(cnt1,cnt2));
        }
    }
}
