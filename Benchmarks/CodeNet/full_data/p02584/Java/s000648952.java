import java.util.Scanner;

public class tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	   	Scanner s = new Scanner(System.in);
	    
	    long dis = s.nextLong();
	    long mov = s.nextLong();
	    long am = s.nextLong();
	    
	    while(mov > 0){
	      
	      if(Math.abs(dis + am) > Math.abs(dis - am))
	        dis -= am;
	      else
	        dis += am;
	     
	      mov--;
	      
	    }
	    
	    System.out.println(Math.abs(dis));
	    
	}

}
