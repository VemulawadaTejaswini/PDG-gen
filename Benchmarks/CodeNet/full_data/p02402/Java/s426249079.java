import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        
        for(int i = 0; i < num; i++){
            a[i] = sc.nextInt();
        }
        
        int max = a[0];
        int min = a[0];
        int sum = 0;
        
        for(int i = 0; i < num; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
            sum += a[i];
        }
        
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}
