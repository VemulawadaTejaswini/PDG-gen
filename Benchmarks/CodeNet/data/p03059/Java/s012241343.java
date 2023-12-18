import java.util.*;

public class TaskA {
  
  private int A, B, T;
  
  public MyClass(String a, String b, String c) {
    this.A = Integer.parseInt(a);
    this.B = Integer.parseInt(b);
    this.T = Integer.parseInt(c);
  }
  
  private int getBuiscit () {
    System.out.println(T/A*B);
  }
    
  public static void main(String[] args) {
    
    MyClass obj = new MyClass(args[0], args[1], args[2]);
    obj.getBuiscit();
    
  }
}
