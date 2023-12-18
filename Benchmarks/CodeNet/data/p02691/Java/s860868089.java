import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),count=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
      for(int j=i+a[i]+1;j<n;j++){
        if(j-i==a[i]+a[j]){
          count++;
        }
      }
    }
    pl(count+"");
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
