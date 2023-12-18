import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
      
    String C = scanner.next();
    
    String[] slist = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    
    for(int i=0; i<26; i++){
      
      if(C.equals(slist[i])){
        C = slist[i+1];
        System.out.println(C);
        break;
      }
  
    }
  }
}

    
    
