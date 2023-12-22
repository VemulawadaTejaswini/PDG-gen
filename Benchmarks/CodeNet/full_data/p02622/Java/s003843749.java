import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String first = sc.next();
      	String last = sc.next();
      	
      	char[] fst = first.toCharArray();
      	char[] lst = last.toCharArray();
      	int count = 0;
      	for(int i = 0; i < fst.length; i++){
        	if(fst[i] != lst[i]){
            	count++;
            }
        }
      System.out.println(count);
    }
}