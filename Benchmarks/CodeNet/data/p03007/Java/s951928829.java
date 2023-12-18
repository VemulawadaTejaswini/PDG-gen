import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(S[i]);
      if(n > 0){
        list1.add(n);
      }else{
        list2.add(n);
      }
    }
    
    Collections.sort(list1);
    Collections.sort(list2);
    int ans = 0;
    int[][] val = new int[N-1][2];
    for(int i = 0; i < N-1; i++){
      if(list2.size() > 1){
        int a = list2.get(0);
        list2.remove(0);
        int b = list2.get(0);
        list2.remove(0);
        list2.add(a-b);
        val[i][0] = a;
        val[i][1] = b;
      }else if(list2.size() == 1 && list1.size() == 1){
        ans = list1.get(0) - list2.get(0);
        val[i][0] = list1.get(0);
        val[i][1] = list2.get(0);
      }else if(list2.size() == 0){
        int a = list1.get(0);
        list1.remove(0);
        int b = list1.get(0);
        list1.remove(0);
        val[i][0] = a;
        val[i][1] = b;
        if(a-b > 0){
          list1.add(a-b);
        }else{
          list2.add(a-b);
        }
      }else{
        int a = list2.get(0);
        list2.remove(0);
        int b = list1.get(0);
        list1.remove(0);
        list2.add(a-b);
        val[i][0] = a;
        val[i][1] = b;
      }
    }
    System.out.println(ans);
    for(int i = 0; i < N-1; i++){
      System.out.print(val[i][0]);
      System.out.print(" ");
      System.out.println(val[i][1]);
    }
  }
}