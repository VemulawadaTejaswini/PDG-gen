import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while(true) {
      int n = scan.nextInt();
      if(n==0) return;
      List<List<Path>> list = new ArrayList<>(10);
      for(int i = 0; i < 10; i++) {
        list.add(new ArrayList<Path>());
      }
      int maxTown = 0;
      for(int i = 0; i < n; i++) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        list.get(a).add(new Path(b,c));
        list.get(b).add(new Path(a,c));
        maxTown = Math.max(maxTown,Math.max(a,b));
      }
      int result = 99999999;
      int resultCount = 1;
      int result_index = 0;
      for(int start = 0; start < maxTown; start++) {
        int[] costs = new int[maxTown+1];
        for(int i = 0; i < maxTown+1; i++) {
          costs[i] = 99999999;
        }
        costs[start] = 0;
        boolean[] flags = new boolean[maxTown+1];
        flags[start] = true;
        calc(costs,flags,list,start,0);
        int _res = 0;
        for(int i = 0; i < maxTown+1; i++) {
          _res += costs[i];
        }
        if(_res==result) {
          resultCount++;
        }else if(_res < result) {
          result = _res;
          result_index = start;
          resultCount=1;
        }
        //System.out.println(Arrays.toString(costs));
        //System.out.println(resultCount+","+result+","+_res+","+result_index);
      }
      System.out.println(result_index+" "+result);
    }
  }
  static void calc(int[] costs, boolean[] flags, List<List<Path>> list, int start, int cost) {
    int minIndex = -1;
    int minCost = 1<<30;
    for(Path _p : list.get(start)) {
      costs[_p.to] = Math.min(costs[_p.to],cost+_p.cost);
    }
    for(int i = 0; i < costs.length; i++) {
      if(!flags[i] && costs[i]<minCost) {
        minIndex = i;
        minCost = costs[i];
      }
    }
    if(minIndex==-1) return;
    flags[minIndex] = true;
    calc(costs,flags,list,minIndex,minCost);
  }
}

class Town{
  int cost;
  int index;
  Town(int _cost, int _index) {
    cost = _cost;
    index = _index;
  }
}

class Path{
  int to;
  int cost;
  Path(int _to, int _cost) {
    to = _to;
    cost = _cost;
  }
}