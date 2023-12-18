import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] X = new int[N*N];
    int[] Y = new int[N*N];
    for(int i0 = 0;i0<N*N;i0++){
      Y[i0] = -1;
    }
    
    //代入
    for(int i1 = 0;i1<N;i1++){
      A[i1] = sc.nextInt();
      for(int i2 = 0;i2<A[i1];i2++){
        X[N*i1+i2] = sc.nextInt()-1;
        Y[N*i1+i2] = sc.nextInt();
      }
    }
    int Result = N;
    int failed = 0;
    int[] Frd = new int[N];
    int[] Enm = new int[N];
    for(int AbsTrue = 0;AbsTrue<N;AbsTrue++){
      Frd = new int[N];
      Enm = new int[N];
      Frd[AbsTrue] = 1;
      for(int Check = 0;Check<N;Check++){
        if(Y[N*AbsTrue+Check]==1){
          Frd[X[N*AbsTrue+Check]]=1;
        }else if(Y[N*AbsTrue+Check]==0){
          Enm[X[N*AbsTrue+Check]]=1;
        }
      }
      
      for(int CL = 1;CL<N;CL++){
        for(int CL2 = 0;CL2<N;CL2++){
          if(Frd[CL2] == 1){
            for(int Check = 0;Check<N;Check++){
              if(Y[N*CL2+Check]==1){
                Frd[X[N*CL2+Check]]=1;
              }else if(Y[N*CL2+Check]==0){
                Enm[X[N*CL2+Check]]=1;
              }
            }
          }
        }
        
        for(int CL3 = 0;CL3<N;CL3++){
          for(int CL4 = 0;CL4<N;CL4++){
            if(Enm[CL4]==1){
              for(int CL5=0;CL5<N*N;CL5++){
                if(Y[CL5]==1&&X[CL5]==CL4){
                  Enm[CL5/N]=1;
                }
              }
            }else if(Frd[CL4] == 1){
              for(int CL6=0;CL6<N*N;CL6++){
                if(Y[CL6]==0&&X[CL6]==CL4){
                  Enm[CL6/N]=1;
                }
              }
            }
          }
        }
      }
      if(Differ(Frd,Enm,N)){
        int EN = 0;
        for(int CL6 = 0;CL6<N;CL6++){
          if(Enm[CL6]==1){
            EN++;
          }
        }
        if(EN<Result){
          Result=EN;
        }
      }
    }
    System.out.println(N-Result); 
  }
  
  public static boolean Differ(int[] I1,int[] I2,int N){
    for(int i = 0;i<N;i++){
      if(I1[i]==I2[i]){
        return false;
      }
    }
    return true;
  }
}