import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[100000];
    int[] table = new int[100000];
    for(int i = 1;i <= n;i++)
      data[i] = sc.nextInt();
    for(int i = 1;i <= n;i++){
      for(int j = 1;j <= n;j++){

        if(data[i] == j){
          table[j] = i;
        }
      }
    }
    for(int i = 1;i <= n;i++) System.out.println(table[i]);
  }
}