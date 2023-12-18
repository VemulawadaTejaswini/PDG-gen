import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    ArrayList<Integer> array= new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int n = new Integer(str);

    str = scan.nextLine();
    String str2[] = str.split(" ");

    for(int i = 0; i < n; i++){
      if(i % 2 == 0){
        array.add(new Integer(str2[i]));
      } else{
        array.add(0, new Integer(str2[i]));
      }
    }

    if(array.size() % 2 == 0){
    for(int i = 0; i < array.size(); i++){
      System.out.print(array.get(i) + " ");
    }
  } else {
    for(int i = array.size() - 1; i >= 0; i--){
      System.out.print(array.get(i) + " ");
    }
  }
    System.out.println();
  }
}
