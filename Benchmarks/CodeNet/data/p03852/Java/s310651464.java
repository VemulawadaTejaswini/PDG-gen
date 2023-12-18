import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] vowelArray = {"a", "i", "u", "e", "o"};
    String ans = "consonant";
    
    for(int i = 0; i < vowelArray.length; i++){
      if(str.equals(vowelArray[i])){
        ans = "vowel";
      }
    }
    System.out.println(ans);
  }
}
      