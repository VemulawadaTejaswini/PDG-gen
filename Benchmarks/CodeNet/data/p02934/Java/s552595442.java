import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    dobule sum = 0;
    String line = sc.nextLine();
    String[] ar = line.split(" ");
    double[] mot = new double[n];
    for(int i = 0; i<n; i++){
      mot[i] = 1/Double.parseDouble(ar[i]);
      sum+=mot[i];
    }
    System.out.println(1/sum);
  }
}