import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
  	public static void main(String[] args){
      //入力値の取得
      Scanner sc = new Scanner(System.in);
	  String[] line1 = new String[3];
	  String[] line2 = new String[3];
	  String[] line3 = new String[3];
	  for(int i=0; i < 3; i++) {
		  line1[i] = sc.next();
	  }
	  sc.nextLine();
	  for(int i=0; i < 3; i++) {
		  line2[i] = sc.next();
	  }
	  sc.nextLine();
	  for(int i=0; i < 3; i++) {
		  line3[i] = sc.next();
	  }
	  sc.nextLine();
	  int n = sc.nextInt();
	  List<String> input = new ArrayList<>();
	  for(int i=0; i <= n; i++) {
		  input.add(sc.nextLine());
	  }
	  sc.close();

	  if (input.contains(line1[0]) && input.contains(line1[1]) && input.contains(line1[2])) {
		  System.out.println("Yes");
		  return;
	  }
	  if (input.contains(line2[0]) && input.contains(line2[1]) && input.contains(line2[2])) {
		  System.out.println("Yes");
		  return;
	  }
	  if (input.contains(line3[0]) && input.contains(line3[1]) && input.contains(line3[2])) {
		  System.out.println("Yes");
		  return;
	  }
	  if (input.contains(line1[0]) && input.contains(line2[1]) && input.contains(line3[2])) {
		  System.out.println("Yes");
		  return;
	  }
	  if (input.contains(line1[2]) && input.contains(line2[1]) && input.contains(line3[0])) {
		  System.out.println("Yes");
		  return;
	  }
	  if (input.contains(line1[0]) && input.contains(line2[0]) && input.contains(line3[0])) {
		  System.out.println("Yes");
		  return;
	  }
	  if (input.contains(line1[1]) && input.contains(line2[1]) && input.contains(line3[1])) {
		  System.out.println("Yes");
		  return;
	  }
	  if (input.contains(line1[2]) && input.contains(line2[2]) && input.contains(line3[2])) {
		  System.out.println("Yes");
		  return;
	  }
	  System.out.println("No");
  	}
}