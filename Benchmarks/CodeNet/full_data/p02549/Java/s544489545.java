import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<k;i++){
      int a=s.nextInt();
      int b=s.nextInt();
      if(!arr.contains(a))
        arr.add(a);
      if(!arr.contains(b))
        arr.add(b);
      }
      int num=arr.size();
      int ans=getCount(arr,num,n);
      System.out.println(ans);
    }
    public static int getCount(ArrayList<Integer> arr,int n,int sum){
      long[] table = new long[n+1];
      Arrays.fill(table, 0);
      table[0] = 1; 
      for (int i=0; i<m; i++) 
            for (int j=arr.get(i); j<=n; j++) 
                table[j] += table[j-arr.get(i)]; 
  
        return table[n]; 
    }
}
