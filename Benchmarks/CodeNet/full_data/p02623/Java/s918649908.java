import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int M=s.nextInt();
    int K=s.nextInt();
    int[] time=new int[N+M];
    for(int i=0;i<N+M;i++) time[i]=s.nextInt();
    Arrays.sort(time);
    int ans=0;
    for(int i=0;i<time.length;i++){
      ans+=1;
      K-=time[i];
      if(K<=0){
        ans-=1;
        break;
      }
    }
    System.out.println(ans);

  }  
}