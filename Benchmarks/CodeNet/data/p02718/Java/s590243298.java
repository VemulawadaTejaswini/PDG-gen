import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    double sel=0.0;
    ArrayList<Integer> a=new ArrayList<>();
    double sum=0;
    int flag=0;
    //if(m<n&&m==0) System.out.println("Yes")
    for(int i=0;i<n;i++){
      int t=sc.nextInt();
      sum+=t;
      a.add(t);
    }
    Collections.sort(a);
    sel=(double)(sum/(4*m));
    //System.out.println(sel);
    int count=0;
    for(int i=n-1;i>-1;i--){
      if((double)a.get(i)>=sel) count++;
      if(count==m) {
        flag=1;break;
      }
    }
	if(flag==1||m==0)System.out.println("Yes");
    else System.out.println("No");
  }
}