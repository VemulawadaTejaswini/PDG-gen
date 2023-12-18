import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
      
      	String astr = "";
      	String bstr = "";
      
      	for (int i=0 ; i<b ; i++) {
          astr = astr + Integer.toString(a);
        }
      
        for (int i=0 ; i<a ; i++) {
          bstr = bstr + Integer.toString(b);
        }
      
      	String[] temp = {astr,bstr};
        Arrays.sort(temp);
 
      	if (temp[0] != "") {
        	System.out.print(temp[0]);
        } else {
           System.out.print(temp[1]);
        }
   
	}
}
