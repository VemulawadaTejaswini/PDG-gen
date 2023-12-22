import java.util.Scanner;

class Cube{
  static int cube(int x){
    return x * x * x;
  }
  public static void main(String[] args){
    Scanner nyuryoku = new Scanner(System.in);
    int n = nyuryoku.nextInt();
    System.out.println(cube(n));
  }
}