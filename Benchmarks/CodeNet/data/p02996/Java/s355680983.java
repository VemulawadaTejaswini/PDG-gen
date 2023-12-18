import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      for(int j=i;j>0;j--){
        if(b[j]<b[j-1]){
          int t=b[j];
          b[j]=b[j-1];
          b[j-1]=t;
          t=a[j];
          a[j]=a[j-1];
          a[j-1]=t;
        }else{
          break;
        }
      }
    }
    int time=0;
    int task=0;
    while(task<n){
      if(time+a[task]>b[task]){
        System.out.println("No");
        return;
      }
      time+=a[task];
      task++;
    }
    System.out.println("Yes");
  }
}