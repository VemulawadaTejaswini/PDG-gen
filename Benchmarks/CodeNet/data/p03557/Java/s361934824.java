import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            b[i] = stdIn.nextInt();
        }
        int[] c = new int[n];
        for(int i=0; i<n; i++){
            c[i] = stdIn.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        long counter = 0;
        for(int i=0; i<a.length; i++){
            for(int j=binarySearchGreaterFirstIndex(b, a[i]); j<b.length; j++){
                if(j != -1){
                    int k = binarySearchGreaterFirstIndex(c, b[j]);
                    if(k != -1){
                        counter += (n - k);
                    }
                }
            }
        }

        System.out.println(counter);
    }

    static int binarySearchGreaterFirstIndex(int[] a, int x){
        int from = 0;
        int to = a.length-1;
        int mid;
        do{
            mid = (from + to) / 2;
            if(x < a[mid]){
                to = mid - 1;
            }else{
                from = mid + 1;
            }
            System.out.println("from: " + from);
            System.out.println("to: " + to);
        }while(from < to);

        if(a[mid] <= x){
            while(a[mid] <= x && mid < a.length-1){
                mid++;
            }
        }else{
            while(a[mid] > x && mid > 0){
                mid--;
            }
            mid++;
        }

        if(x < a[mid]){
            return mid;
        }else{
            return -1;
        }
    }
}