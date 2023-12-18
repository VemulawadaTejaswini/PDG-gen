import java.util.*;


public class main{
	public static void main(String[] args){
		
		
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();   
        int count = 0;
        
        String con = String.valueOf(S);
        String s[] = con.split("");
        int con2[] = Stream.of(s).mapToInt(Integer::parseInt).toArray();

        
        for(int i=0; i<con2.length; i++){
        	if(con2[i] == 1){
        		count++;
        	}
        }
        
    
	   
	   System.out.println(count);
	 }
}
