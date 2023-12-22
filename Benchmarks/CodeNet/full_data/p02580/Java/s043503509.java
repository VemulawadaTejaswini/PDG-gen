import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int M = sc.nextInt();
    int[] h = new int[M];
    int[] w = new int[M];
    for(int in = 0;in<M;in++){
      h[in] = sc.nextInt();
      w[in] = sc.nextInt();
    }
    int Xmax = 0;
    int Xsum = 0;
    for(int i = 0;i<=H;i++){
      Xsum = 0;
      for(int i2 = 0;i2<M;i2++){
        if(h[i2]==i){
          Xsum++;
        }
      }
      if(Xsum>Xmax){
        Xmax = Xsum;
      }
    }
    
    int Ymax = 0;
    int Ysum = 0;
    for(int i3 = 0;i3<=W;i3++){
      Ysum = 0;
      for(int i4 = 0;i4<M;i4++){
        if(w[i4]==i3){
          Ysum++;
        }
      }
      if(Ysum>Ymax){
        Ymax = Ysum;
      }
    }
    
    int[] Xr = new int[1000];
    int[] Yr = new int[1000];
    for(int i5=0;i5<1000;i5++){
      Xr[i5] = -1;
      Yr[i5] = -1;
    }
    int n = 0;
    for(int i6 = 0;i6<=H;i6++){
      Xsum = 0;
      for(int i7 = 0;i7<M;i7++){
        if(h[i7]==i6){
          Xsum++;
        }
      }
      if(Xsum==Xmax){
        Xr[n]=i6;
        n++;
      }
    }
    n= 0;
    for(int i8 = 0;i8<=W;i8++){
      Ysum = 0;
      for(int i9 = 0;i9<M;i9++){
        if(w[i9]==i8){
          Ysum++;
        }
      }
      if(Ysum==Ymax){
        Yr[n]=i8;
        n++;
      }
    }
    
    boolean kaburi = true;
    boolean subK = false;
    for(int l=0;l<1000;l++){
      if(Xr[l]==-1){
        break;
      }else{
        for(int l1=0;l1<1000;l1++){
          for(int l2=0;l2<M;l2++){
            if(Yr[l1]==w[l2]){
              if(Xr[l]==h[l2]){
                l2=M;
              }
              if(l2==M-1){
              kaburi = false;
              l1=1000;
              l=1000;
            }
            }
            
          }
        }
      }
    }
    
    if(kaburi){
      System.out.println(Xmax+Ymax-1);
    }else{
      System.out.println(Xmax+Ymax);
    }
  }
}