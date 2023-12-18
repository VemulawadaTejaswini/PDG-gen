import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String S = sc.next();
      int number = 0;
      for(int i = 0 ; i < 99 ; i++){
        int a = (i + 1) * 2019;
        String testS = S;
        for(int j = 0 ; j < 3 ; j++){
        if(containNumber(testS , a)){
          number++;
          testS = testS.substring(1);
        }
          else
            continue;
        }
          
      }
      
      
	System.out.println(number);
	}
  static boolean containNumber(String s , int a){
    if(s.contains(a + ""))
      return true;
    return false;
    
  }
}