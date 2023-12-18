import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int t = 0;
        int x = 0;
        
        for(int i = 0; cin.hasNext(); i++){
	        String line = cin.nextLine();
	        
	        if(i == 0) {
	            String[] tx = line.split(" ", 0);
	            t = Integer.parseInt(tx[0]);
	            x = Integer.parseInt(tx[1]);
	            
	        } else {
	            
	        }
	        
        }
        
        double res = (double)t / (double)x;
        
        System.out.printf("%.10f", res);
        
    }
    
}
