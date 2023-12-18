public class Main{
  public static void main(String[] args){
  
  String checkStr = args[0];
  
  boolean isHitachiStr = checkStr.matchers(".*hi.*");
  
  System.out.println(isHitachiStr ? "Yes" : "No");
  }
}