import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    String[] h = scanner.nextLine().split(" ");
    
    int max = Integer.parseInt(h[0]);
    int lookAble = 1;
    
    for(int = i; i < h.length; i++) {
      if(max < Integer.parseInt(h[i])) {
        lookAble += 1;
        max = Integer.parseInt(h[i]);
      }
    }

    System.out.print(lookAble);
  }
}