import java.util.*;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      String string = scan.next();
      char[] ch = new char[4];
      for(int i=0;i<4;i++){
        ch[i] = string.charAt(i);
      }
      if(ch[0]==ch[3] && ch[1]==ch[2] && ch[0]!=ch[1]){
        System.out.println("Yes");
      }else if(ch[0]==ch[1] && ch[2]==ch[3] && ch[0]!=ch[2]){
        System.out.println("Yes");
      }else if(ch[0]==ch[2] && ch[1]==ch[3] && ch[0]!=ch[1]){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      
	}
}