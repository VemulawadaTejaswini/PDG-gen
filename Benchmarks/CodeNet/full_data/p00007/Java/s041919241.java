import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        double shakkin = 100000;
        double N = sc.nextInt();
        double totalShakkin = 0;
        
        for (int i=0; i<N; i++){
        	totalShakkin = shakkin + shakkin*0.05;
        	shakkin = totalShakkin;
        	if(shakkin % 1000 > 0){
        		shakkin = (shakkin - shakkin % 1000) + 1000;
        	}
        }
        
        int yamikin = (int)shakkin;
        
        System.out.println(yamikin);
        
    }
}