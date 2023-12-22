import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();
    int d = sc.nextInt();
    int count = 0;
    double[] distArray = new double[n];
    for(int i = 0; i < distArray.length; i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      distArray[i] = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
      if( distArray[i] <= d ){
        count++;
      }
    }

    //output
    System.out.println(count);

  }
}
