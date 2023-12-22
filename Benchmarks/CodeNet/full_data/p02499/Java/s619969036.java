import java.util.Scanner;

public class Main{
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int[] chars = new int[256];

  while(sc.hasNextLine()){

   Stirng line = sc.nextLine();

   for (i = 0; i < line.length(); i++) {
    char c Character.toLowerCase(line.charAt(i));
   }
  }
  for (char c = 'a'; c <= 'z'; c++) {
   System.out.println(ch+":"+chars[c]);
  }
 }
}