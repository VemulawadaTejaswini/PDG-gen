import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            sum += a[i];
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            if(4*a[i]*m >= sum) count++;
        }
        
        if(count >= m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}