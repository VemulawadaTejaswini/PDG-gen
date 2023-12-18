import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int total = 0;
    int[] num = new int[9];
    for (int i = 0 ; i < 9 ; i++){
      num[i] = sc.nextInt();
      total += num[i];
    }
    int nextTotal = num[0] + num[1] + num[3] + num[4];
    if (total % 3 == 0 && nextTotal % 2 == 0) System.out.println("Yes");
    else System.out.println("No");
    sc.close();
  }
}
