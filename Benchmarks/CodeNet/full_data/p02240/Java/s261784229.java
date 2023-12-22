import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numV = scan.nextInt();
    ArrayList<ArrayList<Integer>> vlist = new ArrayList<>(numV);
    for(int i=0; i<numV; i++){
      vlist.add(new ArrayList<>());
    }
    for(int i=0, loop=scan.nextInt(); i<loop; i++){
      int u = scan.nextInt();
      int v = scan.nextInt();
      vlist.get(u).add(v);
      vlist.get(v).add(u);
    }
    int q = scan.nextInt();
    int[] start = new int[q];
    int[] target = new int[q];
    for(int i=0; i<q; i++) {
      start[i] = scan.nextInt();
      target[i] = scan.nextInt();
    }
    int[] color = new int[numV];
    assignColor(vlist,color);
    for(int i=0; i<q; i++) {
      if (color[start[i]]==color[target[i]]) {
        System.out.println("yes");
      }else {
        System.out.println("no");
      }
    }
  }

  static void assignColor(ArrayList<ArrayList<Integer>> vlist, int[] color){
    int[] status = new int[vlist.size()];
    ArrayDeque<Integer> stack = new ArrayDeque<>(vlist.size());

    int colorCount = 0;
    for(int i=0,len=vlist.size(); i<len; i++){
      if(color[i]!=0)
        continue;
      colorCount++;
      int current = i;
      status[current]++;
      stack.addLast(current);
      color[current] = colorCount;

      while(!stack.isEmpty()){
        current = stack.getLast();
        boolean hasNotBroken = true;
        for(int j=0; j<vlist.get(current).size(); j++){
          int adj = vlist.get(current).get(j);
          if(status[adj]==0){
            current = adj;
            status[current]++;
            stack.addLast(current);
            color[current] = colorCount;
            hasNotBroken = false;
            break;
          }
        }
        if(hasNotBroken){
          status[current]++;
          stack.removeLast();
        }
      }
    }
  }
}
