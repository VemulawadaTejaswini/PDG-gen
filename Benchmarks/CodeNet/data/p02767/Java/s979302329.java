import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x[]=new int[n];
    for (int i=0;i<n;i++) {
      x[i]=sc.nextInt();
    }
    Arrays.sort(x);

    // for (int i=0;i<n;i++) {
    //   System.out.println(x[i]);
    // }

    int p;
    if (n%2==0) {
      p=(x[n/2]+x[n/2-1])/2;
    }else{
      p=x[n/2];
    }

    int ans=0;

    for (int i=0;i<n;i++) {
      ans=ans+((x[i]-p)*(x[i]-p));
    }

    System.out.println(ans);


  }
}
