import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        
       Scanner sc = new Scanner(System.in);
       long num = sc.nextLong();
       
       long x =num;
       long a=1;
       long b=1;
       //素因数分解を一度行う
       for (long i = 2;i <= num;) {
            if (x % i == 0) { // 最小の因数を求める 
                if(a<b){
                    
                    a=a*b;//項が3ついじょうある場合、小さい項同士はかけあわせる
                    b=i;//最大項は代入
                    
                }else{
                    b=a*b;
                    a=i;
                }
                
                x /= i; // 最小の因数で割った数を代入する
            } else
                i++;
        }
        long answer = (a-1)+(b-1);
        
        System.out.println(answer);
        
        
       
       
       
    
        
    }
    
}