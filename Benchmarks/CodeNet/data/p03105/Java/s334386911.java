import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
ArrayList<Integer> list = new ArrayList<Integer>();
 

    String str = sn.nextLine();
      
String[] num = str.split(" ", 3);
      
		int A=num[0]/num[1];
		if(A>num[2]){
		    A=num[2];
		}
      System.out.println(A);

}
}