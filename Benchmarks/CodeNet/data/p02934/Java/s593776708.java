import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double sum = 0;
    for(int i=0; i<N; i++){
      sum += 1.0/sc.nextInt();
    }
    sum = 1.0/sum;
 
    System.out.print(sum);
  }
}
