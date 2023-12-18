import java.util.*;
class Main{
	public static void main(String[]args){
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	String x = in.nextLine(), y = in.nextLine(), z="";
      	for(int i = 0 ; i < n ; i++){
        	if(i%2==0)
              z+=x.charAt(i);
          	else 
              z+=y.charAt(i);
        }
      	System.out.println(z);
    }
}