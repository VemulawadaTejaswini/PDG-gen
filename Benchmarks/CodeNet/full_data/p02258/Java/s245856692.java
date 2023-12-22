import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        int n;
        int[]R;
        
        Scanner scan = new Scanner(System.in);       
        n = scan.nextInt();
        R = new int[n];
        
        for(int i=0 ; i < n;i++) {
            R[i] = scan.nextInt();
        }
        
        
         int answer = R[1] - R [0] ; 
         int min = R[0];
        
        for (int i = 1 ; i < n; i++){
                    if (R[i] - min > answer){ 
                    answer = R[i] - min;
                   }
                   if(min> R[i]){
                    min = R [i];
                   }
                

            } 

       
        System.out.println(answer);
    }
  }