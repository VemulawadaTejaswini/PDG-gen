import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Long> list = new ArrayList<>();
    String[] S = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      long n = Long.parseLong(S[i]);
      list.add(n);
    }
    
    Collections.sort(list, Collections.reverseOrder());
    
    long len1 = 0;
    long len2 = 0;
    long tem = list.get(0);
    for(int i = 1; i < N; i++){
      if(len1 > 0 && len2 > 0){
        break;
      }
      
      if(tem == list.get(i)){
        if(len1 == 0){
          len1 = tem;
          i++;
          tem = list.get(i);
        }else{
          len2 = tem;
        }
      }else{
        tem = list.get(i);
      }
    }
    
    long ans = len1 * len2;
    System.out.println(ans);
  }
}