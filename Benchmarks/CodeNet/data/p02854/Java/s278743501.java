import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    double sum=0.0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      sum+=a[i];
    }
    int x=0;
    int y=0;
    for(int i=0;i<n;i++){
      y+=a[i];
      if(y>sum/2.0){
        x=y-a[i];
        break;
      }else if(y==sum/2.0){
        System.out.println(0);
        System.exit(0);
      }
    }
    if(x==y){
      System.out.println(x-sum/2.0);
    }else if((sum/2.0-x)<=(y-sum/2.0)){
      for(int i=1;i<n;i++){
        x++;
        sum++;
        if(x>=sum/2.0){
          System.out.println(i);
          break;
        }
      }
    }else{
      for(int i=1;i<n;i++){
        x--;
        sum--;
        if(x<=sum/2.0){
          System.out.println(i);
          break;
        }
      }
    }
  }
}