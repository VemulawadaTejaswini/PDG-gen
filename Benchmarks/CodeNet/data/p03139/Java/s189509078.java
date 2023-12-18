import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int n = 1;
        int a = 0;
        int b = 0;
        
        for(int i = 0; cin.hasNext(); i++){
	        String line = cin.nextLine();
	        
	        if(i == 0) {
	            String[] s = line.split(" ", 0);
	            
	            n = Integer.parseInt(s[0]);
	            a = Integer.parseInt(s[1]);
	            b = Integer.parseInt(s[2]);
	            
	        } else {
	            
	        }
	        
        }
        
        int min = 0;
        
        if(a < b) {
            min = a;
            
        } else {
            min = b;
            
        }
        
        int c = a + b - n;
        
        if(c < 0) {
            c = 0;
            
        }
        
        System.out.println(min + " " + c);
        
    }
    
}
