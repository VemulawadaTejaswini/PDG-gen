import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        for(int i = 0;i < n;i++) {
            l[i] = stdIn.nextInt();
            r[i] = stdIn.nextInt();
        }
        int count = 0;
        for(int i = 0;i < n;i++){
            count += (r[i] - l[i] + 1);
        }
        System.out.println(count);
        
    }

}