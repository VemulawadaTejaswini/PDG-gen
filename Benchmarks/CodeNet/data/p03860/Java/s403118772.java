import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      String str[] = line.split(" ");
      String a = str[0].substring(0,1);
      String b = str[1].substring(0,1);
      String c = str[2].substring(0,1);
      System.out.println(a+b+c);
	}
}
