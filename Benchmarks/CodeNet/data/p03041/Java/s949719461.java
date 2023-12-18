import java.util.Scanner;
import java.util.Arrays; 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    int k = sc.nextInt();
    char[] letters = sc.next().toCharArray();
    letters[k-1] += 32;
    String output = String.valueOf(letters);
    System.out.println(output);
  }
}