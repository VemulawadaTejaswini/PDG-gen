import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    String T = scan.nextLine();
    
    int result = -1;

	
    String partT = T;
    for(int changeNum= 0; changeNum<T.length();changeNum++){
    
      for(int index = 0; index <changeNum;index++){
        partT = T.substring(index, T.length()-changeNum+index);
        if(S.indexOf(partT) >= 0){
          result = changeNum;
          break;
        }
      }
    }
    
    System.out.println(result);
  }
}
      
      
      
      
