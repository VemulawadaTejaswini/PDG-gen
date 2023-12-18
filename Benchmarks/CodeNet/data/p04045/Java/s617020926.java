import java.util.*;
class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    Set<Integer> ng = new HashSet<>();
    for(int i=0;i<k;i++)ng.add(Integer.parseInt(sc.next()));
    int money = n;
    boolean flag = true;
    while(true){
      int tmp = money;
      flag = true;
      while(tmp > 0){
        int digit = tmp%10;
        if(ng.contains(digit)){
          flag = false;
          break;
        }
        tmp/=10;
      }
      if(flag){
        System.out.println(money);
        return;
      }else{
        money++;
      }
    }
  }
}
