import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    try {
      while(true){
        int n = sc.nextInt();
        if(n == 0)break;
        for(int i=0;i<n;i++){
          int s = sc.nextInt();
          list.add(s);
        }
        Collections.sort(list);
        list.remove(0);
        list.remove(list.size()-1);
        int Avg = 0;
        for(Integer num : list){
          Avg += num;
        }
        System.out.println(Avg/list.size());
        list.clear();
      }
      
    } catch (Exception e) {
    }
    sc.close();
  }
}
