import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] c=sc.next().toCharArray();
    if(c.length>=4){
      if(c[0]=='Y'&&c[1]=='A'&&c[2]=='K'&&c[3]=='I'){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      System.out.println("No");
    }
      
  }
}
