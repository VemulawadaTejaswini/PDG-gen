import java.util.*;

public class Main{
  
  static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> p = new ArrayList<Integer>();
    ArrayList<Integer> q = new ArrayList<Integer>();
    for(int i=0;i<n;i++){
      p.add(sc.nextInt());
    }
    for(int i=0;i<n;i++){
      q.add(sc.nextInt());
    }
    
    all(n,new ArrayList<Integer>());
    
    
    int ans = 0;
    
    int rankp=0,rankq=0;
    for(int i = 0;i<fact(n);i++){
      if(list.get(i).equals(p)){
        rankp = i;
      }
      if(list.get(i).equals(q)){
        rankq = i;
      }
    }
    ans = Math.abs(rankp-rankq);
    System.out.println(ans);
    
  }
  
  
  private static int fact(int n){
    if(n==0)return 1;
    else return n*fact(n-1);
  }

  private static void all(int n,ArrayList<Integer> a){
	
    if(a.size()==n){
      list.add(a);
    }
    
    boolean[] used = new boolean[n];
    for(int i=0;i<n;i++){
      used[i]=false;
    }
    for(int i=0;i<a.size();i++){
      used[a.get(i)-1]=true;
    }
    
    
    for(int j=0;j<n;j++){//列の長さ=選択肢の分
      if(!used[j]){
        ArrayList<Integer> b = (ArrayList<Integer>)a.clone();
        b.add(j+1);
        all(n,b);
      }
    }
    
  }


}
  