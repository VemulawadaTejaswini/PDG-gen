import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s =  sc.nextLine();
    char a = 'A';
    char b = 'Z';
    
    int count = 0;
    
    for(int i = 0;i<s.length();++i){
      
      if(a==(s.charAt(i))){
         
        for(int j = i;j<s.length();++j){
          if(b!=(s.charAt(j))){
            count +=1;
          }else{
            break;
          }
        }
        if(count!=0){
          break;
        }
      }
      if(count!=0){
        break;
      }
    }
      System.out.println(count+1); 
      
  }
}