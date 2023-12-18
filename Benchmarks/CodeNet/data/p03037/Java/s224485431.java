import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int A = 0;
        int B = 0;
        
        for (int index=0; index<M; index++){
            
            if (index==M-1){
                A=sc.nextInt();
            } 
            
            if (index==0){
                
                if (index!=M-1){
                    sc.nextInt();
                }
                B=sc.nextInt();
            } 
            
            if (index!=0&&index!=M-1){
                sc.nextInt();
                sc.nextInt();
            }
        }
        
        System.out.println(Math.abs(A-B)+1);
    }
}