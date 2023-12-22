import java.util.Scanner;
public class Main{
  public static void main(String args[]){
      Scanner l = new Scanner(System.in);
      int length = l.nextInt();
      String word = l.next();
      String newS = "";
      
      if(word.length() <= length){
          System.out.println(word);
        }
        else{
            newS = word.substring(0, length);
            System.out.println(newS+"...");
        }
}
}
