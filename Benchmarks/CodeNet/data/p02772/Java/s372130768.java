import java.util.Scanner;
 
public class paperPlease {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int bar[] = new int[N];
    for(int i = 0;i < N;i++){
      bar[i] = scan.nextInt();
    }
    System.out.println(N + "");
  }
}
