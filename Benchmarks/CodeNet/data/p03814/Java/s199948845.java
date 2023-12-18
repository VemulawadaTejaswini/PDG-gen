import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s =  sc.nextLine();
    char a = 'A';
    char b = 'Z';
    
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    
    for(int i = 0;i<s.length();++i){
           
      if(a!=(s.charAt(i))){
        count1 +=1;
      }
      if(a==(s.charAt(i))){
        break;
      }
    }
    
    
    
    for(int i = 0;i<s.length();++i){
           
      if((b==(s.charAt(i))) && (count2<=i)){    
        
          count2=i; 
        
      }
      
    }
    count2 +=1;

    int result = count2 - count1;
    System.out.println(result);

  }
}