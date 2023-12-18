import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String[] str = new String[9];
      for(int i = 0;i < 9;i++){
      	str[i] = sc.next();
      }
      System.out.println(str[0]+str[4]+str[8]);
      sc.close();
    }
}