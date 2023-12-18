import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        // int c = stdIn.nextInt();
        // String s = stdIn.next();
        // boolean flag = true;
        
        int x[] = new int[n];
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            x[i] = stdIn.nextInt();
            sum += x[i];
        }
        
        int ave = sum / n;
        
        int bunsan1 = 0;
        int bunsan2 = 0;
        
        for(int i = 0; i < n; i++){
            bunsan1 += Math.pow(x[i] - ave, 2);
        }
        
        for(int i = 0; i < n; i++){
            bunsan2 += Math.pow(x[i] - ave - 1, 2);
        }
        
        System.out.println(Math.min(bunsan1, bunsan2));
        
        // char c[] = s.toCharArray();
        
        // for(int i = 0; i < s.length(); i++){
        //     c[i];
        // }

        
        // if(flag){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        
        // System.out.println();
        // System.out.print();
    }
}