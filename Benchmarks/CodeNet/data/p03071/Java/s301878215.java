import java.util.Scanner;
import java.util.Arraylist;

public class Main{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in());
    List<int> list = new Arraylist<>();
    while(Scan(System.in()).hasnextInt()){
      list.add(Scan(System.in()));
    }
    list.add(0);
    for(int i = 0; i<=2; i++){
      list = getcoin(list);
    }
    return list.get(2);
  }
  public Arraylist getcoin(Arraylist list){
      int a = list.get(0);
      int b = list.get(1);
      int sum = list.get(2);
      if ( a>= b ) {
        sum = sum+a;
        a = a-1;
      }else{
        sum = sum + b;
        b = b-1;
      }
      list.set(0,a);
      list.set(1,b);
      list.set(2,sum);
      return list;
    }

}
