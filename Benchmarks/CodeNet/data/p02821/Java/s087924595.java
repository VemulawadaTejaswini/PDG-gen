import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    long M=scan.nextLong();
    Integer[] a=new Integer[N];
    for(int i=0;i<N;i++){
      a[i]=scan.nextInt();
    }
    Arrays.sort(a,Collections.reverseOrder());
    int ans=0;
    int count=0;
    for(int i=0;i<N;i++){
      for(int j=i;j<N;j++){
        if(j==i){
          ans+=a[i]+a[j];
          count++;
          if(count>=M){
            System.out.println(ans);
            System.exit(0);
          }
        }else{
          for(int k=0;k<2;k++){
            ans+=(a[i]+a[j]);
            count++;
            if(count>=M){
              System.out.println(ans);
              System.exit(0);
            }
          }
        }
      }
    }
  }
}