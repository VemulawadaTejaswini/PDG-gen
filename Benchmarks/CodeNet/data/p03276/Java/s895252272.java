import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for(int i=0; i<n; i++) {
            x[i] = sc.nextInt();
        }

        int min = 1000000000;
        for(int i=0; i+k-1<n; i++) {
            int left =x[i];
            int right = x[i+k-1];
            int d = 1000000000;
            if(right < 0) {
                d = -left;
            } else if(left<0){
                d = Math.min(-left * 2 + right, -left + right * 2);
            } else {
                d = right;
            }
            min = Math.min(min, d);
        }

        System.out.println(min);
    }

}
