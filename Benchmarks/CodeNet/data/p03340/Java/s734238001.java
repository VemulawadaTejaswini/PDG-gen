import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] A=new int[N];
    String[] binA=new String[N];
    int[] ans=new int[N];
    ans[N-1]=1;
    int Ans=0;
    
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      binA[i]=Integer.toBinaryString(A[i]);
    }
    
    for(int idx=0;idx<N;idx++){
      int checker=0;
      Boolean[] Check=new Boolean[21];
      for(int i=0;i<21;i++){
        Check[i]=false;
      }
      for(int j=idx;j<N;j++){
        int len=binA[j].length();
        for(int k=len-1;k>=0;k--){
          if(binA[j].charAt(k)=='1'&&Check[20+k-len+1]==true){
            ans[idx]+=j-idx;
            checker=1;
            break;
          }else if(binA[j].charAt(k)=='1'){
            Check[21+k-len]=true;
          }else{
          }
        }
        
        if(checker==1){
          break;
        }
      }
    }
    
    for(int i=0;i<N;i++){
      //System.out.print(ans[i]+" ");
      Ans+=ans[i];
    }
    
    
    System.out.print(Ans);
  }
}