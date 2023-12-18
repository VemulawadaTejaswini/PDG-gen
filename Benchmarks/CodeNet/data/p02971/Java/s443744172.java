import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
      	int coursol = sc.nextInt();
		int AnsMax = 0;
		int AnsMin = 0;      
      
    	for( int i = 0 ; i < coursol ; i++){
 			int x = sc.nextInt();
          	boolean endflg =false;
          	if(AnsMax < x ){
            	AnsMax = x;
              	endflg = true;
            }
			if( AnsMin < x  && endflg != true ){
            	AnsMin = x;
            }
		}
		System.out.println(AnsMin);
       }
}
