import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int sum = 0;
        int[] a = new int[n+2];
        int[] b = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(sc.next());
            sum += Math.abs(a[i-1] - a[i]);
        }
        sum += Math.abs(a[n]);
        
        for(int i = 1; i <= n; i++){
            if(a[i-1] < a[i]){
                if(a[i+1] < a[i]){
                    if(a[i-1] < a[i+1]){
                        b[i] = Math.abs(a[i] - a[i+1]) *2;
                    }else{
                        b[i] = Math.abs(a[i-1] - a[i]) *2;
                    }
                }
            }else if(a[i] < a[i-1]){
                if(a[i] < a[i+1]){
                    if(a[i+1] < a[i-1]){
                        b[i] = Math.abs(a[i] - a[i+1]) *2;
                    }else{
                        b[i] = Math.abs(a[i-1] - a[i]) *2;
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(sum - b[i]).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}