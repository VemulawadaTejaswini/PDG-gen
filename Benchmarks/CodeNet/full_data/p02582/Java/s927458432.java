import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	String[] Rain = S.split("S");
      	
      	int cnt = 0;
      	for(String r : Rain){
        	if(r.length() >=2){
            	cnt++;
            }
        }
    System.out.println(cnt);
    }
}