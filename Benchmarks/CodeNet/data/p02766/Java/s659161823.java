import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    List<Integer>list = new  ArrayList<>();
    int amari = 0;
    for(;N > K;){
      amari = N % K;
      list.add(amari);
      N = N / K;
    }
    list.add(amari);
    if(N != 0)list.add(N);
    System.out.println(list.size());
  }
}