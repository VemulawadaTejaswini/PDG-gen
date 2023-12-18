import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String line;
        
        ArrayList<Integer> n = new ArrayList<Integer>();
        
        for(int i = 0; cin.hasNext(); i++){
	        line = cin.nextLine();
	        
	        if(i == 0) {
	            String[] _n = line.split(" ", 0);
	            
	            for(int j = 0; j < 4; j++) {
	                n.add(Integer.parseInt(_n[j]));
	            
	            }
	            
	        } else {
	            
	        }
	        
        }
        
        Collections.sort(n);
        
        String res = "NO";
        
        if(n.get(0) == 1 && n.get(1) == 4 && n.get(2) == 7 && n.get(3) == 9) {
            res = "YES";
            
        }
        
        System.out.println(res);
        
    }
    
}
