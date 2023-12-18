import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int w = scan.nextInt();
    int sum = 0;
    ArrayList<ArrayList<Character>> a = new ArrayList<ArrayList<Character>>();
    for (int i=0;i<h;i++){
      String g = scan.next();
      ArrayList<Character> b = new ArrayList<Character>();
      for (int j=0;j<w;j++){
        b.add(g.charAt(j));
        if (g.charAt(j) == '.'){
          sum += 1;
        }
      }
      a.add(b);
    }

    boolean[][] c = new boolean[h][w];

    for (int i=0;i<h;i++){
      for (int j=0;j<w;j++){
        c[i][j] = false;
      }
    }
    ArrayList<Integer> m = new ArrayList<Integer>();
    m = find(a,h-1,w-1,0,0,1,m,c);
    if (m.size() == 0){
      System.out.println(-1);
      return;
    }
    Collections.sort(m);
    System.out.println(sum - m.get(0));

  }

  static ArrayList<Integer> find(ArrayList<ArrayList<Character>> g, int target_h, int target_w, int current_h, int current_w, int count, ArrayList<Integer> ret, boolean[][] pp){
    if ((target_h == current_h) && (target_w == current_w)){
      ret.add(count);
      return ret;
    }

    ArrayList<Character> a = g.get(current_h);

    if (current_h > 0){
      ArrayList<Character> b1 = g.get(current_h-1);
      if ( (pp[current_h-1][current_w] != true) && (b1.get(current_w) != '#')){
        pp[current_h][current_w] = true;
        ret = find(g,target_h,target_w,current_h-1,current_w,count+1,ret,pp);
        pp[current_h][current_w] = false;
      }
    }

    if (current_h < target_h){
      ArrayList<Character> b2 = g.get(current_h+1);
      if ((pp[current_h+1][current_w] != true) && (b2.get(current_w) != '#')){
        pp[current_h][current_w] = true;
        ret = find(g,target_h,target_w,current_h+1,current_w,count+1,ret,pp);
        pp[current_h][current_w] = false;
      }
    }

    if (current_w < target_w){
      if ((pp[current_h][current_w+1] != true) &&(a.get(current_w + 1) != '#')){
        pp[current_h][current_w] = true;
        ret = find(g,target_h,target_w,current_h,current_w+1,count+1,ret,pp);
        pp[current_h][current_w] = false;
      }
    }

    if (current_w > 0){
      if ((pp[current_h][current_w-1] != true) && (a.get(current_w - 1) != '#')){
        pp[current_h][current_w] = true;
        ret = find(g,target_h,target_w,current_h,current_w-1,count+1,ret,pp);
        pp[current_h][current_w] = false;
      }
    }

    return ret;

  }

}
