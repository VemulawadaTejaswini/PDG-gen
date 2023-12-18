import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n + 1];
        int ball[] = new int[n + 1];
        int count = 0;
        boolean flag = true;
        
        for(int i = 1; i <= n ; i++){
            a[i] = stdIn.nextInt();
        }
        
        for(int i = n; i > 0; i--){
            int sum = 0;
            int j = i;
            for(int k = j; k <= n; k++){
                if(k % j == 0){
                    sum += a[k];
                }
            }
            
            if(sum % 2 == 0){
                ball[j] = 0;
            }else{
                ball[j] = 1;
                count++;
            }
        }
        
        System.out.println(count);
        
        int scount = 0;
        
        for(int i = 1; i <= n; i++){
            
            if(ball[i] == 1){
                if(count != scount - 1){
                    System.out.print(i + " ");
                    scount++;
                }else{
                    System.out.print(i);
                }
            }
        }
        
    }
}
