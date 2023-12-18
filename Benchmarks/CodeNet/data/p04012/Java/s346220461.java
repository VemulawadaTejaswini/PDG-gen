import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    String w = sin.nextLine();
    if(w.length%2 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }  
  }  
}  