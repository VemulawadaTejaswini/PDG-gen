import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i= 0; i < n; i++){
      array[i] = sc.nextInt();
    }
    String s = "DENIEED";
    int count = 0;
    int cnt2 = 0;
    for(int i=0;i < n;i++){
      if(array[i] % 2 == 0){
        cnt2++;
        if((array[i] % 3 == 0) || (array[i] % 5 == 0)) count++;
      }
    }
    if(count == cnt2) s ="APPROVED";
    System.out.println(s);
  }
}
