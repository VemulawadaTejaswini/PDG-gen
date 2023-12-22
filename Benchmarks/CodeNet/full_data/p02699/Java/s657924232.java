import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner s=new Scanner(System.in);
      	int s=s.nextInt();
      	int w=s.nextInt();
      	if(w>=s){
        	System.out.println("unsafe");
        }else{
        	System.out.println("safe");
        }
    }
}