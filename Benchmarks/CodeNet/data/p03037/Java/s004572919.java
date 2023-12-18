import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int min = 2147483647;
        int max = 0;
        for (int index=0; index<M; index++){
            
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left>max){
                max=left;
            }
            if (right<min){
                min=right;
            }
        }
        
        if (min<max){
            System.out.println("0");
        } else {
            System.out.println(min-max+1);
        }
        
        
    }
}