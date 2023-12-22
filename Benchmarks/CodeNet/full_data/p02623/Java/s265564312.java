import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[k];
    int s=sc.nextInt();
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<k;i++){
      b[i]=sc.nextInt();
    }
    int t=s;
int maxcount=-1;
int count=0;
    for(int i=0;i<=n;i++){
      if(i!=0){
        s=s-a[i-1];
      }
      //System.out.println("value of s "+s);
      if(s<=0){
        break;
      }
      t=s;
      count=i;
      for(int j=0;j<k;j++){
        if(t>=0 && b[j]<=t){
          count=count+1;
          t=t-b[j];
        }
      }
      //System.out.println("value of i "+i+" count "+count);
      if(maxcount<count){
        maxcount=count;
      }

    }

    System.out.println(maxcount);
  }
}