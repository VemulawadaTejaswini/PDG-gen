import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int a[]=new int[n];

    for (int i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }

    int count1=0;
    int count2=0;
    for (int i=0;i<n;i++) {
      if (a[i]%2==0) {
        count1++;
        if (a[i]%3==0||a[i]%5==0) {
          count2++;
        }
      }
    }

    if(count1==0||count1==count2){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");
    }
  }
}
