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
    public static int getCount(ArrayList<Integer> arr,int num,int sum){
      if(sum==0)
        return 1;
      if(num==0)
        return 0;
      int res=getCount(arr,num-1,sum);
      if(arr.get(num-1)<=sum)
        res+=getCount(arr,num,sum-arr.get(num-1));
      return res%998244353;
    }
}
