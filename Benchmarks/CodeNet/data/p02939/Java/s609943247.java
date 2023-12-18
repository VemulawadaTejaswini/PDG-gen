import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.nextLine();
      	String before = "";
      	String now = "";
      	int count = 0;
      	for(int i=0;i<s.length();i++){
        	now = now + s.substring(i,i+1);
          	if(before.equals(now)){
            	continue;
            }
          	before = now;
          	now = "";
          	count++;
        }
      	System.out.println(count);
    }
}