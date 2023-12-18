import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a];
    double c = 0;
    for(int i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
    }
    for(int j = 0;j < b.length;j++){  
      c += 1 /(double) b[j];  
//      System.out.println(c);
    }
    c = 1 / c;
    System.out.println(c);
  }
}