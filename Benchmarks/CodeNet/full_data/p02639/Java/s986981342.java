import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[5];
        
        for(int i=0; i<5; i++){
            n[i] = sc.nextInt();
            if(n[i]==0){
                System.out.println(i+1);
                return;
            }
        }
        
        
   }
}
