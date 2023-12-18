import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        //int a = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //String s = stdIn.next();
        int a[] = new int[n];
        int b[] = new int[n];
        String s[] = new String[n];
        String k[] = new String[n];
        int sum = 0;
        boolean flag = true;
        //char c[] = s.toCharArray();
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            s[i] = "";
            s[i] += a[i];
        }
        
        for(int i = 0; i < n; i++){
            b[i] = stdIn.nextInt();
            s[i] += b[i];
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(s);
        
        for(int i = 0; i < n; i++){
            k[i] = "";
            k[i] += a[i];
            k[i] += b[i];
            if(a[i] > b[i]){
                flag = false;
                break;
            }
        }
        
        if(flag){
            boolean flag2 = false;
            int numa = 0;
            int numb = 0;
            
            while(numa < n && numb < n){
                long num1 = Integer.parseInt(s[numa]);
                long num2 = Integer.parseInt(k[numb]);
                
                if(num1 == num2){
                    sum++;
                }else if(num1 > num2){
                    numb++;
                }else{
                    numa++;
                }
                
                if(sum == 2){
                    flag2 = true;
                    break;
                }
                
            }
                
            if(!flag2){
                flag = false;
            }
            
        }
        
        
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
