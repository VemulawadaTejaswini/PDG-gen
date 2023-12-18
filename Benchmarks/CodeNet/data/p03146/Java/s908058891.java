import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt();
		int a = sc.nextInt();
    	int count = 0;
    	int count2 = 0;
    	if(a == 1){
        	count = count + 1;
        }
    	if(a == 2){
        	count = count - 2;
        }
    	while(count2 < 2){
      		count = count + 1;
      		if(a == 4){
            	count2 = count + 1;
            }
			if(a%2==0){
            	a = a/2;
            }else{
             	a = a*3 + 1;
            }
   		 }
    
    	System.out.println(count);
	}
}