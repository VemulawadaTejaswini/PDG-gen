import java.util.*;
class Main {
  public static void main(String[] args){
    
      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      System.out.println(Buttons(x,y));
 

  }
    public static int Buttons(int A, int B) {
      if(A==B) return A+B;
      int result = Math.max(A, B);
      return result+result-1;
       
    }
}