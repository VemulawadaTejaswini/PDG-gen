import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      String t = sc.next();
      
      int result = 0;
      for(int i=0; i < s.length(); i++){
      	if(s.subString(i,1) != t.subString(i, 1)){
          result++;
        }
      }
        
      System.out.print(result);
    }
}
