import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.nextLine();
      	int count =0;
       	int max = 0;
      	for(int i =0;i<s.length();i++){
        	if(s.charAt(i)='R'){
            	count++;
            }else{
            	max = Math.max(count, max);
              	count=0;
            }
        }
        System.out.println(count);
        
    }
}
