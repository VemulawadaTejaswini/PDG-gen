import java.util.Arrays;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] indegrients = new int[n];
    for(int i = 0; i < n; i++){
      indegrients[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(indegrients);
    for(int i = 0; i < n - 1; i++){
      indegrients[i + 1] = (indegrients[i] + indegrients[i + 1]) / 2;
    }
    System.out.println(indegrients[n - 1]);
  }
}