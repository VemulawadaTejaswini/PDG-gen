import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int N , X;
      int i = 0; 
      while (scan.hasNextLine()) {
      String an = scan.nextLine();
      list.add(an);
      }
      String List[] = list.get(0).split(" ",0);
      N = Integer.parseInt(List[0]);

  //    System.out.println(N);
      int num[] = new int[N];
      if(N != 0){
      String Atai[] = list.get(1).split(" ",0);
      while(i < N){
        num[i] = Integer.parseInt(Atai[i]);
        i++;
      }
      check(num,N);
      }
        scan.close();
    }
  
  public static void check(int[] num,int n){
    int count = 0;
    int s = 0;
    int i = 0;
    int j = 0;
    boolean flag = true;
    while(i < n){
      j = 0;
      flag = true;
      while(j < n){
        if(i != j){
        s = num[i]%num[j];
        if(s == 0){
          flag = false;
        }
      } 
        j++;
      }
      if(flag){
        count++;
      }
      i++;
    }
    System.out.println(count);
  }
}