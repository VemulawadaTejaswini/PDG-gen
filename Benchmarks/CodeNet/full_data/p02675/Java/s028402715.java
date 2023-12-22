import java.util.Scanner;
public class Main{
  public static void main(String args[]){
      Scanner l = new Scanner(System.in);
      int length = l.nextInt();
      String word = l.next();
      
      if(word.length() > length){
          String newS = word.substring(0, length);
          System.out.println(newS+"...");
        }
        else{
            System.out.println(word);
        }
}
}
