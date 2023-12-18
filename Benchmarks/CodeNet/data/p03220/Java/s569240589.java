import java.util.*;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }

        int[] ave = new int[n];
        for (int i = 0; i < ave.length; i++) {
            ave[i] = t - (int)(h[i]*0.006);
        }

        int min = Math.abs(a - ave[0]);
        for (int i = 0; i < ave.length; i++) {
            ave[i] = a - ave[i];
            if (ave[i] <= min) {
                min = ave[i];
            }
        }

        int count = 0;
        for (int i = 0; i < ave.length; i++) {
            if(min == ave[i]){
               System.out.println(i+1);
               break;
            }    
            else count++;
        }



    }
}