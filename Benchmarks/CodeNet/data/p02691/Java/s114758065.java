import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int [] List=new int[N];
    for(int i=0;i<N;i++) List[i]=s.nextInt();
    
    int i=0;
    int j=0;
    int ans=0;
    
	while(i<N){
      j=i+1;
      while(j<N){
        if(List[i]+List[j]==j-i) ans+=1;
        j+=1;
      }
      i+=1;
    }
    System.out.println(ans);
  }  
}