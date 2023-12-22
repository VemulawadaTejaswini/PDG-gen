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
          int k = containNumber(testS , a);
          switch(k){
            case 0: 
              number++;
            case 1:
              testS = testS.substring(1);
              break;
            case 2:
              continue;
             
          }
        }
          
      }
      
      
	System.out.println(number);
	}
  static int containNumber(String s , int a){
    if(s.startsWith(a + ""))
      return 0;
    else if(s.contains(a + ""))
      return 1;
    return 2;
    
  }
}