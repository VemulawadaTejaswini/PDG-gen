import java.util.Scanner;
public class Main{
  public static void main(String args[]){
      Scanner l = new Scanner(System.in);
      System.out.println("Enter length: ");
      int length = l.nextInt();
      
      Scanner s = new Scanner(System.in);
      System.out.print("Enter String: ");
      String word = s.nextLine();
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
