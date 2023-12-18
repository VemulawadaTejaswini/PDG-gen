import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int goal = sc.nextInt();
        int[] allpoint = new int[number];
        int[] allave = new int[number];
        int[] a = new int[number * 2];
        int count = 0;
        int countall;
        int maxcount = 0;
        int maxall = 0;
        int s,j;
        for (int i = 0; i < number; i++) {
            a[i * 2] = sc.nextInt();
            a[i * 2 + 1] = sc.nextInt();
        }
        while (goal > 0) {
            for ( s = 0; s < number; s++) {
                allpoint[s] = a[s * 2]*100*(s+1) + a[s * 2 + 1];
                if(a[s*2]==0){
                    allave[s] =0;
                    continue;
                }
                if (allpoint[s] < goal) {
                    allave[s] = allpoint[s] / a[s * 2];
                } else {
                    allave[s] = goal / a[s * 2];
                }
                
            }
            for ( j = 0; j < number; j++) {
                if (maxall < allave[j]) {
                    maxall = allave[j];
                    maxcount = j;
                }
            }
            if (maxall > number  * 100 ) {
                goal -= allpoint[maxcount];                
                count += a[maxcount*2];
                a[maxcount *2] =0;
                a[maxcount * 2+1] = 0;
                maxall = 0;
            } else {
                while (goal >= 0 ^ a[number * 2 - 2] > 0) {
                    goal -= number * 100;
                    a[number * 2 - 2]--;
                    count++;
                }
            }
        }
        System.out.print(count);
        
    }

}
