import java.util.Scanner;

class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n,s;
    boolean is;
    
    while(sc.hasNextInt()){
    	n = sc.nextInt();
    	if(n == 0)break;
    	s = 0;
    	
    	for(int i = 2; n != 0; i++){
    		is = true;
    		
    		for(int j = 2; j <= Math.sqrt(i); j++)
    			if(i % j == 0)is = false;
    		
    		if(is){
    			n--;
    			s += i;
    		}
    	}
    	System.out.println(s);
    }
    sc.close();
  }
}