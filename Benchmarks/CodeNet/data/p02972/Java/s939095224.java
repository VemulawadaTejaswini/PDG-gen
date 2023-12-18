import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
    }
    
    Set<Integer> set = new HashSet<>();
    for(int i = N-1; i >= 0; i--){
      int a = i+1;
      if(a > N/2 && num[i] == 1){
        set.add(a);
      }else{
        int j = 2;
        int b = a * j;
        int count = 0;
        while(b <= N){
          if(set.contains(b)){
            count++;
            count %= 2;
          }
          j++;
          b = a * j;
        }
        if((count == 0 && num[i] == 1) || (count == 1 && num[i] == 0)){
          set.add(a);
        }
      }
    }
    List<Integer> list = new ArrayList<>(set);
    System.out.println(list.size());
    for(int i = 0; i < list.size(); i++){
      if(i+1 != list.size()){
        System.out.print(list.get(i));
        System.out.print(" ");
      }else{
        System.out.println(list.get(i));
      }
    }
  }
}