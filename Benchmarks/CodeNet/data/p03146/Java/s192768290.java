import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int a = s;
    list.add(a);
    while(true){
      if(list.contains(func(a))){
        System.out.println(list.size() + 1);
        break;
      }
      a = func(a);
      list.add(a);
    }
  }
  
  public static int func(int a){
    if(a % 2 == 0){
      return a / 2;
    }else{
      return 3 * a + 1;
    }
  }
}