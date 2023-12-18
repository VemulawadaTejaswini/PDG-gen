import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    
    int max = sc.nextInt();
    
    for(int i = 1; i <= max; i++){
      list1.add(i);
    }
    
    int num1 = 0;
    int num2 = list1.size() - 1;
    for(int i = 0; i < list1.size() / 2; i++){
      list2.add(list1.get(num1) % list1.get(num2));
      num1++;
      num2--;
    }
    
    Collections.sort(list2, Collections.reverseOrder());
    System.out.println(list2.get(0));

  }
}