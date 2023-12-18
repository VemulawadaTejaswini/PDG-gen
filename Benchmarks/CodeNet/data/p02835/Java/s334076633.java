public class Main {
  
  public static void main(String... args) {
    int i1 = Integer.parseInt(args[0]);
    int i2 = Integer.pzrseInt(args[1]);
    int i3 = Integer.parseInt(args[2]);
    int result = i1 + i2 + i3;
    
    if (result > 21) {
      System.out.println("bust");
    } else {
      System.out.println("win");
    }
  }
  
}
