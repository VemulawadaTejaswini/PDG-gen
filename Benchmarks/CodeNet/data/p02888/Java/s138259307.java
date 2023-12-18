import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int[] L=new int[N];
    for(int i=0;i<N;i++){
      L[i]=scan.nextInt();
    }
    Arrays.sort(L);
    int count=0;
    int a,b;
    int highid=N-1;
    int lowid,mid;
    for(int i=0;i<N-2;i++){
      highid=N-1;
      for(int j=i+1;j<N-1;j++){
        a=L[i];
        b=L[j];
        lowid=j+1;
        if(a+b>L[lowid]&&a+b<L[highid]){
          while(highid-lowid<=1){
            mid=(highid+lowid)/2;
            if(a+b>L[lowid]){
              lowid=mid;
            }
            if(a+b<L[highid]){
              highid=mid;
            }
          }
          count+=(N-1)-highid+1;
        }
        else if(a+b>L[highid]&&a+b>L[lowid]){
          count+=highid-lowid+1;
        }
        else if(a+b<L[highid]&&a+b<L[lowid]){
          count+=0;
        }
      }
    }
    System.out.println(count);
  }
}