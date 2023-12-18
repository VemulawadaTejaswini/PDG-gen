import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); //N人の仲間たち
    int k = sc.nextInt(); //ジェットコースターに乗るのに必要なKcm
    int a[] = new int[n]; //仲間たちの身長を格納する配列
    int num = 0;          //乗ることのできる人数

    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      if(a[i] >= k){
        num++;
      }
    }

    System.out.println(num);
  }
}