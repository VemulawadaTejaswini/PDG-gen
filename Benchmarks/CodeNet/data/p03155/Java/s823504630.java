import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String line;
        int n = 0;
        int h = 0;
        int w = 0;
        
        for(int i = 0; cin.hasNext(); i++){
	        line = cin.nextLine();
	        
	        if(i == 0) {
	            n = Integer.parseInt(line);
	            
	        } else if(i == 1) {
	            h = Integer.parseInt(line);
	            
	        } else if(i == 2) {
	            w = Integer.parseInt(line);
	            
	        } else {
	            
	        }
	        
        }
        
        int _h = n - h;
        int _w = n - w;
        
        if(_h < 0 || _w < 0) {
            System.out.println(0);
            
        } else {
            System.out.println((_h + 1) * (_w + 1));
        
        }
        
    }
    
}
