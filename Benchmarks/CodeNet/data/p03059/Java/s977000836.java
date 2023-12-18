public class MyClass {
  
  private int A, B, T;
  
  public MyClass(int a, int b, int c) {
    this.A = a;
    this.B = b;
    this.T = c;
  }
  
  private int getBuiscit () {
    System.out.println(T/A*B);
  }
    
  public static void main(String[] args) {
    
    MyClass obj = new MyClass(args[0], args[1], args[2]);
    obj.getBuiscit();
    
  }
}