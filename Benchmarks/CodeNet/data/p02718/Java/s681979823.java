import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] in = new int[n];
    int sum = 0;
    for(int i = 0; i < n; i++){
      in[i] = sc.nextInt();
      sum += in[i];
    }
    int total = 0;
    double line = sum / (4.0 * m);
    for(int i = 0; i < n; i++){
      if(in[i] >= line){
        total++;
      }
    }
    if(total >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}