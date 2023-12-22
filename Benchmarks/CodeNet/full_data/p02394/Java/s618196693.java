import java.util.Scanner;
  
public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String line = sc.nextLine();
  String[] split = line.split(" ");
  int[] num = new int[split.length];
  
  for (int i = 0; i < split.length; i++) {
   num[i] = Integer.parseInt(split[i]);
  }
  int w = num[0];
  int h = num[1];
  int x = num[2];
  int y = num[3];
  int r = num[4];
  String str = null;
  if(r <= x && x <= (w - r) && r <= y && y <= (h - r)) {
   str = "Yes";
  } else {
   str = "No";
  }
    
  System.out.println(str);
  sc.close();
 }
}