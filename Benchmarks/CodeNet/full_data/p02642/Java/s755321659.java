import java.util.*;

class Main{

  public static boolean checker(int a,int[] List){
    for(int i=0;i<List.length;i++){
     if(List[i]==a) return false; 
    }
    return true;
  }
  
  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int[] box=new int[N];
    int newList=N;
    for(int i=0;i<N;i++){
      int x=s.nextInt();
      if(checker(x,box)) box[i]=x;
      else newList-=1;
    }

    int[] List=new int[newList];
    int k=0;
    for(int i=0;i<N;i++){
      if(box[i]!=0){
        List[k]=box[i];
        k+=1;
      }
    }

    int ans=0;
    for(int i=0;i<List.length;i++){
      for(int j=i+1;j<List.length;j++){
        if(List[i]%List[j]==0) break;
      	if(j==N-1) ans+=1;
      }

    }
    System.out.println(ans);
  }  
}