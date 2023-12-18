import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] box = new int[n];
    List<Integer> li = new ArrayList<Integer>();
    for(int i = 0;i<n;i++){
      box[i] = 1;
    }
    li.add(0);
    for(int i = 0;i<m;i++){
      int x = sc.nextInt(),y = sc.nextInt();
      box[x-1]--;
      box[y-1]++;
      if(li.contains(x-1)){
        if(!(li.contains(y-1))){
          li.add(y-1);
        }
        if(box[x-1]==0){
          li.remove(li.indexOf(x-1));
        }
      }
    }
    int count = li.size();
    System.out.println(count);
  }
}
