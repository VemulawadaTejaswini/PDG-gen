import java.util.*;

class Restaurant{
  int id;
  String name;
  int point;
  
  Restaurant(int i, String s, int p){
    id = i;
    name = s;
    point = p;
  }
  @Override
  public int compare(Restaurant r1, Restaurant r2) {
		int n;
    	n = -r1.name.compare(r2.name);
    	if (n == 0) n = (r1.point < r2.point) ? -1: 1;
    	return n;
  }
}

public class Main{
  public static void main(String[] args){
    ArrayList<Restaurant> r = new ArrayList<>();
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(int i = 0; i < n; i ++){
      String s = sc.next();
      int p = sc.nextInt();
      Restaurant re(i+1, s,p);
      r.add(re);
    }
    Collections.sort(r);
    for(int i = n-1; i >= 0; i --){
      SYstem.out.print(r.get(i).id);
      if (i != 0)SYstem.out.println();
    }
  }
}