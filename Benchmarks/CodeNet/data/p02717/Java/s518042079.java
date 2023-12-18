import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    int Z = scanner.nextInt();
    
    int x = X;
    int y = Y;
    int z = Z;
    
    Y = x;
    Z = y;
    X = z;
    
    System.out.println(X+" "+Y+" "+Z);
  }
}

    