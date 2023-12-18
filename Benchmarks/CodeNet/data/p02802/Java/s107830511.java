import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] question = new int[n];
        final long CLEARED_SIGN = 1000000;
        int cleared = 0;
        int q;
        boolean ac;
        for(int i=0; i<m; i++){
            q = sc.nextInt()-1;
            ac = sc.next().equals("AC");
            if(question[q] >= CLEARED_SIGN) continue;
            if(ac){
                question[q] += CLEARED_SIGN;
                cleared++;
            }else{
                question[q]++;
            }
        }
        long penalties = 0;
        for(int i : question){
            penalties += i;
        }
        penalties -= CLEARED_SIGN*cleared;
        System.out.println(cleared+" "+penalties);
    }
}