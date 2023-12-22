import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
    name = name.substring(0, 3);
    System.out.println(name);

  }
}