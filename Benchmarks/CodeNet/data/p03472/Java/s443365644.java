import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int h=sc.nextInt();
    int a=0;
    Integer[] b=new Integer[n];
    for(int i=0;i<n;i++){
      a=Math.max(sc.nextInt(),a);
      b[i]=sc.nextInt();
    }
    Arrays.sort(b);
    int fi;
    for(fi=0;fi<n;fi++){
      if(b[fi]>a){
        break;
      }
    }
    int ans=0;
    for(int i=n-1;i>=fi;i--){
      h-=b[i];
      ans++;
      if(h<=0){
        System.out.println(ans);
        return;
      }
    }
    System.out.println((h+a-1)/a+ans);
  }
}