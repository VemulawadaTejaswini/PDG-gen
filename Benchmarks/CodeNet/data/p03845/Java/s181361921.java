import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> Ti = new ArrayList<Integer>();
    int num = 0;
    for(int i=0;i<N;i++){
      Ti.add(sc.nextInt());
    }
    for(int i=0;i<N;i++){
      num += Ti.get(i);
    }
    int M = sc.nextInt();
    ArrayList<Integer> Pi = new ArrayList<Integer>();
    ArrayList<Integer> Xi = new ArrayList<Integer>();
    for(int i=0;i<M;i++){
      Pi.add(sc.nextInt());
      Xi.add(sc.nextInt());
    }
    int a = 0;
    int num1 = 0;
    for(int i=0;i<M;i++){
      num1 = num;
      a = Pi.get(i)-1;
      num1 -= Ti.get(a);
      num1 += Xi.get(a);
      System.out.println(num1);
    }
  }
}