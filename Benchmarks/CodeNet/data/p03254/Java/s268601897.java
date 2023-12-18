import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(x >= a[i]){
                x -= a[i];
                count++;
            }else{
                break;
            }
        }
        if(x > 0 && count > 0){
            count--;
        }
        
        System.out.println(count);
    }
}
