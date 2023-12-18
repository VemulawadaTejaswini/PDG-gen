import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    int N = sc.nextInt();
    int num = 0;
    for(int i=0;i<N;i++){
      num = sc.nextInt();
      if(list.contains(num)){
        list.remove(list.indexOf(num));
      }else{
        list.add(num);
      }
    }
    System.out.println(list.size());
  }
}