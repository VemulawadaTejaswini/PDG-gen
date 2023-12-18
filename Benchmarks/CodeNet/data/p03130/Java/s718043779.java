import java.util.*;
public class Main{
 	public static void main(String[] args) {
 	    
		Scanner sc = new Scanner(System.in);
      	
      	int[] n = new int[4];
      	int a=0;
        
        
        for(int i=0; i<6; i++){
            a = sc.nextInt();
            n[a-1]++;
            
        }
        
        for(int i=0; i<4; i++){
            
            if(!(n[i]<3)){
            System.out.println("NO");
            return;
                
            }
            
        }
        
        System.out.println("YES");
 	}
}
