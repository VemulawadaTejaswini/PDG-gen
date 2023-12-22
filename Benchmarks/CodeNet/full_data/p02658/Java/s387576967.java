import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main{
public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i;
	List<Long> list = new ArrayList<Long>();
  	for(i = 0; i< n; i++){
      	list.add( sc.nextLong() );	
	}
  
	long ans;
	ans = 1;
  
  	long bod;
  	bod = (long)Math.pow(10,18);
  
	for(i = 0; i<list.size(); i++){
      	ans *= list.get(i);
		if( (0 <=ans) && (ans <= bod) ){
          continue;
   	 	}
  		else{
    		ans = -1;
          	break;
  		}
	}
  System.out.println(ans);
}
}