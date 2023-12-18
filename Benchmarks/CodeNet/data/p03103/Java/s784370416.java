import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int m=scan.nextInt();
    List<Integer> a=new ArrayList<>();
    List<Integer> b=new ArrayList<>();
    List<Integer> cop=new ArrayList<>();
    for(int i=0;i<n;i++){
      a.add(scan.nextInt());
      cop.add(a.get(i));
      b.add(scan.nextInt());
    }
    Collections.sort(cop);
    long ans=0L;
    int i=-1;
    int sum=0;
    int index;
    int x=0;
    int y=0;
    while(sum<=m){
      i++;
      x=cop.get(i);
      index=a.indexOf(x);
      y=b.get(index);
      sum+=y;
      ans+=(long)(x*y);
    }
    ans-=(long)(x*(sum-m));
    System.out.println(ans);
  }
}
