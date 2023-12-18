import java.util.*;
public class Main{
  public static void main(String[] args){
    int i,j;
    int ans=0;
    int plus=1;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n-1];//2~n->0~n-2
    int[] times=new int[n-1];
    List<Integer> loser=new ArrayList<Integer>();
    Arrays.fill(times,0);
    for(i=0;i<n-1;i++){
      a[i]=sc.nextInt();
      if(a[i]==1){loser.add(i);}else{times[a[i]-2]++;}
    }
    for(i=0;i<loser.size();i++){
      if(times[loser.get(i)]==ans)plus++;
      ans=Math.max(times[loser.get(i)],ans);
    }
    System.out.println(ans+plus);
  }
}
