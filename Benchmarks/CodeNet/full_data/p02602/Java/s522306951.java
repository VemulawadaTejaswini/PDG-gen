import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] arr = new long[n+1];
    long[] pre = new long[n+1];
    for(int i=1;i<=n;i++){
      arr[i]=sc.nextLong();
    }
    pre[1]=arr[1];
    for(int i=2;i<=n;i++){
      pre[i]=pre[i-1]*arr[i];
    }
   // for(int i=1;i<=n;i++){
    //  System.out.print(pre[i]+" ");
    //}
    ArrayList<Long> list = new ArrayList<>();
    for(int i=k;i<=n;i++){
      if(i-k<=0){
        list.add(pre[i]);
      }
      else{
        list.add(pre[i]/pre[i-k]);
      }
    }
    for(int i=1;i<list.size();i++){
    //  System.out.println(list.get(i));
      if(list.get(i)>list.get(i-1)){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
  }
}