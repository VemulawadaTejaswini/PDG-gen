import java.util.*;

class Main{
  public static void main(String[] args){
  ArrayList<String> array = new ArrayList<String>();
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  for(int i = 0; i < n + 1; i++){
    String str = in.nextLine();
    String str2 = str.replaceAll("Hoshino", "Hoshina");
    array.add(str2);
    }
    for(String s: array){
      System.out.println(s);
    }
  }
}