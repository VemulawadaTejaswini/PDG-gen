import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for(int i=0;i<n;i++){
            l[i] = Integer.parseInt(sc.next());
        }
        sort(l, 0, n-1);
        int max = l[0];
        int sum = 0;
        for(int i=1;i<n;i++){
            sum += l[i];
        }
        if(max < sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}