import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final long x = sc.nextLong();
    long l = 100;
    for(int i=0;;i++){
      if(l >= x){
        System.out.println(i);
        break;
      }
      l += l / 100;
    }
  }
}