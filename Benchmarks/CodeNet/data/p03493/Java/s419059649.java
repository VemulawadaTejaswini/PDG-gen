import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    char[] c = scanner.nextLine().toCharArray();
    
    for(int i = 0; i < c.length; i++){
      if(c[i] == '1'){
        count++;
      }
    }
    System.out.println(count);
    scanner.close();
  }
}