import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = String.valueOf(Long.parseLong(s)).length();		//桁数
        //System.out.println("n="+n);
        int count = 0;		
      
        for (int i=0; i<n-3; i++) {
        for (int j=i+3; j<n; j++) {
			if((Long.parseLong(s.substring(i,j)))%2019==0){ 
				count++; 
		       // System.out.println("(i,j)=("+i+","+j+")");				
			}
        }
 			if((Long.parseLong(s.substring(i)))%2019==0){ 
				count++; 
		       // System.out.println("(i,j)=("+i+","+j+")");				
			}       
        }

        System.out.println(count);
	    scan.close();	
    }
}