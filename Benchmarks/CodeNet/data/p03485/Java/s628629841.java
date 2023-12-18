import java.util.Scanner;
 
public class Main {
  
public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int x = in.nextInt();
  int y = in.nextInt();
  System.out.println(floor(average(x, y)));
}
 
private float average(int x, int y){
  return (x+y) / 2;
}
 
private int floor(float z){
  return Math.floor(z);
}
  
}
