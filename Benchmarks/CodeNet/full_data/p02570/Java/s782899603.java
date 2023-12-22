import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    String T = scan.nextLine();
    
    int result = -1;
    int changeNum = 0;
    

	
    String partT = T;
    while(S.indexOf(partT) <0){
      for(int index = 0; index <partT.length();index++){
        partT = T.substring(index, T.length()-changeNum);
        if(S.indexOf(partT) >= 0){
          result = changeNum;
          break;
        }
      }
      if(result >=0){
        break;
      }
      changeNum++;
    }
    
    System.out.println(result);
      
      
      
         
         }}
      
      
      
      
