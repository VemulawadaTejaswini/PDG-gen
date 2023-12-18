import io.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] lines = line.split();
    
    int T = Integer.parseInt(lines[0]);
    int X = Integer.parseInt(lines[1]);
    
    System.out.println(T / X);
  }
}