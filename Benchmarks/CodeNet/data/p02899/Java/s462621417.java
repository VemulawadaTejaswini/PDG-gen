import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();

        int[] a = new int[n];

        for(int i = 0;i < n;i++) {
            a[i] = stdIn.nextInt();
        }

        int[] result = new int[n];

        for(int i = 0;i < n;i++){
            result[a[i]-1] = i+1;
        }

        for(int i : result){
            System.out.println(i);
        }
    }

}