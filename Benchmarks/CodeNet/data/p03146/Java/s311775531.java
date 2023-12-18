import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt();
    	int count = 0;
    	int count2 = 0;
    	if(s==1){
        	count = count - 1;
        }
    	if(s==2){
        	count = count - 2;
        }
    	while(count2<2){
      		count = count + 1;
      		if(s==4){
            	count2 = count2 + 1;
            }
			if(s%2==0){
            	s = s/2;
            }else{
             	s = s*3 + 1;
            }
   		 }
    
    	System.out.println(count);
	}
}
