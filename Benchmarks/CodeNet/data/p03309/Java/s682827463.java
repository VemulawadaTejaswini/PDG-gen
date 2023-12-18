import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Long> list = new ArrayList<>();
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      list.add(sc.nextLong() - i);
    }
    
    Collections.sort(list);
    long size = list.get((int)(list.size() / 2));
	
    long ans1 = 0L;
    long ans2 = 0L;
    for(int i = 0; i < n; i++){
       ans1 += Math.abs(list.get(i) - size);
    }
    
    size = list.get((int)(list.size() / 2) + 1);
    for(int i = 0; i < n; i++){
       ans2 += Math.abs(list.get(i) - size);
    }

    
    System.out.println((int)((ans1 < ans2) ? ans1 : ans2));
    return;
  }
}
