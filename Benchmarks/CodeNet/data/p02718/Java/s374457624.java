import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int sum = 0;
    int count = 0;
    int[] pop = new int[n];
    for(int i = 0; i < n; i++){
      pop[i] = scan.nextInt();
      sum += pop[i];
    }
    Arrays.sort(pop);
    int border = sum/(4*m);
    for(int i = n-1; i>=0; i--){
      if(pop[i] >= border){
        count++;
      }else{
        break;
      }
      if(count == m){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}
