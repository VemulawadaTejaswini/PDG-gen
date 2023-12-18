import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int count = 0;
      int max = 0;
      for(int i = 0;i < n;i++){
      	if(s.substring(i,i+1).equals("I")){
        	count++;
          	max = Math.max(max,count);
        }else{
        	count--;
            max = Math.max(max,count);
        }
      }
      System.out.println(max);
    }
}
