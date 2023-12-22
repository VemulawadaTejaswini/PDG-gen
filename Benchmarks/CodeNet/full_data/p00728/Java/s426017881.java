import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.run();
    }
    
    public void run(){
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            int n = sc.nextInt();
            if(n == 0) break;
            
            int sum = 0;
            int min = 1000;
            int max = 0;
            for(int i = 0 ; i < n ; i++){
                int buff = sc.nextInt();
                sum += buff;
                min = Math.min(min,buff);
                max = Math.max(max,buff);
            }
            int ans = (sum - min - max)/(n-2);
            System.out.println(ans);
        }
    }
}