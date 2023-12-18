import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n];
        int count = 1;
        int min = 0;
        
        for(int i = 0; i < n ; i++){
            a[i] = stdIn.nextInt();
        }
        
        min = a[0];
        
        for(int i = 1; i < n ; i++){
            if(a[i] <= min){
                //min = a[i];
                count++;
            }
        }
        
        System.out.println(count);
        
    }
}