import java.util.Scanner;

public class Main{
  static int pivot(int[] a,int i,int j){
    int k=i+1;
    while(k<=j && a[i]==a[k]) k++;
    if(k>j) return -1;
    if(a[i]>=a[k]) return i;
    return k;
  }

  static int partition(int[] a,int i,int j,int x){
    int l=i,r=j;

    while(l<=r){

      while(l<=j && a[l]<x)  l++;

      while(r>=i && a[r]>=x) r--;

      if(l>r) break;
      int t=a[l];
      a[l]=a[r];
      a[r]=t;
      l++; r--;
    }
    return l;
  }

  public static void quickSort(int[] a,int i,int j){
    if(i==j) return;
    int p=pivot(a,i,j);
    if(p!=-1){
      int k=partition(a,i,j,a[p]);
      quickSort(a,i,k-1);
      quickSort(a,k,j);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int a[]=new int[n];
    int flg=0;
    int cmd=0;
    long ans=0;
    //HashMap<Integer,Integer> num=new HashMap<Integer,Integer>();
    long x[]=new long[n];
    long y[]=new long[n];
    int cnt=0;

    for(int i=0;i<n;i++){
      a[i]=scanner.nextInt();
    }

    quickSort(a,0,a.length-1);

    for(int i=0;i<n-1;i++){
      if(a[i]<=0&&a[i+1]>0){
        flg=1;
        cmd=i;
      }
    }

    if(flg==1){
      x[cnt]=a[cmd];
      y[cnt]=a[cmd+1];
      cnt++;
      ans=a[cmd]-a[cmd+1];
      for(int i=cmd+2;i<n-1;i++){
        x[cnt]=ans;
        y[cnt]=a[i];
        cnt++;
        //System.out.println(ans+" "+a[i]);
        ans=ans-a[i];
      }
      //System.out.println(a[n-1]+" "+ans);
      x[cnt]=a[n-1];
      y[cnt]=ans;
      cnt++;
      ans=a[n-1]-ans;
      for(int i=0;i<cmd;i++){
        x[cnt]=ans;
        y[cnt]=a[i];
        cnt++;
        //System.out.println(ans+" "+a[i]);
        ans=ans-a[i];
      }
    }
    else{
      if(a[0]<0){
        for(int i=0;i<n/2;i++){
          int tmp=a[i];
          a[i]=a[n-1-i];
          a[n-1-i]=tmp;
        }

        ans=a[0];
        for(int i=1;i<n-1;i++){
          x[cnt]=ans;
          y[cnt]=a[i];
          cnt++;
          ans=ans-a[i];
        }
        x[cnt]=ans;
        y[cnt]=a[n-1];
        cnt++;
        ans=ans-a[n-1];

      }
      else{
        ans=a[0];
        for(int i=1;i<n-1;i++){
          x[cnt]=ans;
          y[cnt]=a[i];
          cnt++;
          ans=ans-a[i];
        }
        x[cnt]=a[n-1];
        y[cnt]=ans;
        cnt++;
        ans=a[n-1]-ans;
      }
    }

    System.out.println(ans);

    for(int i=0;i<n-1;i++){
      System.out.println(x[i]+" "+y[i]);
    }
  }
}
