public class Main{
  public static void main(String[] args){
  
  String checkStr = args[0];
  
  boolean isHitachiStr = checkStr.matches(".*hi.*");
  
  System.out.println(isHitachiStr ? "Yes" : "No");
  }
}