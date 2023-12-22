

import java.util.*;
 
public class  Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 0;
       

        int a[] = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        for(int w = 0; w < N; w++){
            int num = a[w];
           
            if(isPrime(num) == true){
                x++;
            }
        }
        System.out.println(x);
    }


    public static boolean isPrime(int num) {
        
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; 
    
        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2){
            if (num % i == 0){
        
            return false;
            }
        }
        return true;       
    }
}
