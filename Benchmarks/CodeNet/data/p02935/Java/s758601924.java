import java.util.*;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int value=0;
    List<Integer> list = new ArrayList<Integer>();
    /*int [] Vi = new  int[N];
    for(int i=0;i<N;i++){
      Vi[i] = scan.nextInt();
    }
    Arrays.sort(Vi);
    for(int i=0;i<N;i++){
      System.out.println(Vi[i]);
    }*/
    for(int i=0;i<N;i++){
      value = scan.nextInt();
      list.add(value);
    }
    while(list.size()>1){
    //System.out.println(list.size());
    Collections.sort(list);
    int result = Alt(list.get(0),list.get(1));
    list.add(result);
    Collections.sort(list);
    list.remove(0);
    list.remove(1);
    //System.out.println(list.size());
    //System.out.println(list);
  }
  System.out.println(list);
  }
  public static int Alt(int num1,int num2){
    return (num1+num2)/2;
  }
}
