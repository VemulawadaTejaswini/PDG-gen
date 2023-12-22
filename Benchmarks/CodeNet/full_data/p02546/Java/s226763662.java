import java.util.*;
class Solution{
	public static void main(String[]args){
      Scanner scan=new Scanner(System.in);
    	String str=scan.nextLine();
      	if(str.charAt(str.length()-1)=='s'){
        	System.out.println(str+"es");
        }else{
        	System.out.println(str+"s");
        }
    }	
  
}