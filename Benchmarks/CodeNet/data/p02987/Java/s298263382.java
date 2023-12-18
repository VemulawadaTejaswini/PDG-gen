import java.util.*;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      String string = scan.next();
      char[] c = new char[4];
      for(int i=0;i<4;i++){
        c[i] = string.charAt(i);
      }
      if(c[0]==c[3] && c[1]==c[2] && c[0]!=c[1]){
        System.out.println("Yes");
      }else if(c[0]==c[1] && c[2]==c[3] && c[0]!=c[2]){
        System.out.println("Yes");
      }else if(c[0]==c[2] && c[1]==c[3] && c[0]!=c[1]){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      
	}
}
