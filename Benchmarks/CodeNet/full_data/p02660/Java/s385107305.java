import java.util.*;

public class Main{

  public long d(long num){
    long ans=0;
    while(true){
      long i=1;
      if(num-i>=0){
        ans++;
      }else{
        break;
      }
      i++;
    }
    return ans;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long n=sc.nextLong(),x=n,sum=0;
    List<Long> soinsu=new ArrayList<Long>();
    Map<Long,Long> map=new HashMap<Long,Long>();
    for(int i=2;i<n;){
      if(){
        list.add(i);
        x/=i;
        if(map.get(i)==null){
          map.set(i,1);
        }else{
          map.set(i,map.get(i)+1);
        }
      }else{i++;}
    }
    for(long key:map.keySet()){
      sum+=d(map.get(key));
    }
  }
}
