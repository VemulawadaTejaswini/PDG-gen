import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        long[] h = new long[n];
        for(int i = 0;i < n;i++){
            h[i] = stdIn.nextLong();
        }

        int max = 0;
        int count = 0;

        for(int i = 0;i < n-1;i++) {
            if(h[i+1] <= h[i]){
                count++;
            }else{
                max = count;
                count = 0;
            }
        }

        if(count > max){
            max = count;
        }
        
 
        System.out.println(max);

        
    }

}