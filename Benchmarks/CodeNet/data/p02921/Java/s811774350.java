import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int s = sc.nextInt();
      	int t = sc.nextInt();
      
      	for(int i = 0; i < s.length(); i++){
        	char[] slist = new char[3];
          	slist[i] = s.charAt(i);
        }
      	
      	for(int i = 0; i < t.length(); i++){
        	char[] tlist = new char[3];
          	tlist[i] = t.charAt(i);
        }
      	
      	int result = 0;
      
      	for(int i = 0; i < slist.length; i++){
          	if(slist[i] == tlist[i]){
            	result += 1;
            }
        }
      
      System.out.println(result);
	}
}