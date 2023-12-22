import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String[] strArray = sc.nextLine().split(" ");
    int count=0;
    for(int i=0; i<strArray.length; i++)
    {
      if(strArray[i].equals("END_OF_TEXT")) break;

      if(word.equals(strArray[i].toLowerCase()))
      {
        count++;
      }
    }
    out.println(count);
  }
}
