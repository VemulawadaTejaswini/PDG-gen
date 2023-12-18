import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Restaurant> list = new ArrayList<Restaurant>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
        String name = sc.next();
        int point = sc.nextInt();
        list.add(new Restaurant(name, point, i));
        }
        Collections.sort(list);
        for (Restaurant res: list) {
        System.out.println(res.i);
      }
    }
}

class Restaurant implements Comparable<Restaurant> {
  String name;
  int point;
  int i;
  
  public Restaurant(String name, int point, int i) {
    this.name = name;
    this.point = point;
    this.i = i;
  }
 
 @Override
  public int compareTo(Restaurant obj) {
    int ans = name.compareTo(obj.name);
    if (ans != 0){
         return ans;
    }
    //同じときは、点数で降順にする
    return Integer.compare(point, obj.point)*-1;
  }
}