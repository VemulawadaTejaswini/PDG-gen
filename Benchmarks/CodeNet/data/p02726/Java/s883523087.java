import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),x = sc.nextInt(),y = sc.nextInt();
    ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    int count[]=new int[n];
    for(int i=0;i<n;i++){
      g.add(new ArrayList<Integer>());
      if(i!=0){
        g.get(i).add(i-1);
      }
      if(i!=n-1){
        g.get(i).add(i+1);
      }
    }
    g.get(x-1).add(y-1); g.get(y-1).add(x-1);

    for(int i=0;i<n;i++){
      int di[]=dijk(n,i,g);
      for(int j=i+1;j<n;j++){
        count[di[j]]++;
      }
    }
    for(int i=1;i<n;i++){
      pl(count[i]+"");
    }
  }

  public static int[] dijk(int n,int s,ArrayList<ArrayList<Integer>> g){
    int dist[]=new int[n];
    boolean flg[]=new boolean[n];
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(s);
    dist[s]=0;
    flg[s]=true;
    while(list.size()!=0){
      int num = list.get(0);
      list.remove(0);
      for(int i:g.get(num)){
        if(!flg[i]){
          list.add(i);
          flg[i]=true;
          dist[i]=dist[num]+1;
        }
      }
    }
    return dist;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
