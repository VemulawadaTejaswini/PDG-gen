import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int K=s.nextInt();
    int d1=s.nextInt();
    int [] List=new int[N];
    for(int i=0;i<N;i++) List[i]=0;
    
    while(s.hasNext()){
      int x=s.nextInt();
      List[x-1]+=1;
    }

    int ans=0;
    for(int i=0;i<N;i++) if(List[i]==0) ans++;
    System.out.println(ans);
  }  
}