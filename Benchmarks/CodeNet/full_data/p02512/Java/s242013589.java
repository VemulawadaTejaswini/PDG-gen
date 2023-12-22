import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            
            int curPeep = 0;
            int curTime = m+1;
            int curDiff = 0;
            boolean hasDupe = false;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int time = m - m % a;
                if (time < curTime || time == curTime && a < curDiff) {
                    curTime = time;
                    curDiff = a;
                    curPeep = i+1;
                    hasDupe = false;
                }
                else if (time == curTime && curDiff == a) {
                    hasDupe = true;
                }
            }
            
            System.out.println(hasDupe ? n : curPeep);
        }
    }

}