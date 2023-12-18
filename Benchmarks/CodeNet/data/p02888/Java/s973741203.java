//Triangles
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l[]=new int[n];
    for (int i=0;i<n;i++) {
      l[i]=sc.nextInt();
    }

    int count=0;

    for (int i=0;i<n-2;i++) {
      for (int j=i+1;j<n-1;j++) {
        for (int t=j+1;t<n;t++) {
          if (l[i]<l[j]+l[t] && l[j]<l[i]+l[t] && l[t]<l[i]+l[j]) {
            count=count+1;
          }
        }
      }
    }

    System.out.println(count);

  }
}
