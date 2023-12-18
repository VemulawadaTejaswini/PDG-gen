import java.util.*;

class Main{
  static int count=0;
  public static void swap(int[] a,int idx1,int idx2){
    int tmp=a[idx1];
    a[idx1]=a[idx2];
    a[idx2]=tmp;
  }
  
  public static int partition(int[] a,int s,int n){
    int count=0;
    int pl=s;
    int pr=n-1;
    int x=a[(pl+pr)/2];
    while(pl<=pr){
      while(x>a[pl])pl++;
      while(x<a[pr])pr--;
      if(pl<=pr) swap(a,pl++,pr--);
      count++;
    }
    /*System.out.println("枢軸の値は"+x+"です。");
    System.out.println("枢軸以下のグループ");
    for(int i=0;i<=pl-1;i++){
      System.out.print(a[i]+" ");
    }
    if(pl>pr+1){
      System.out.println("");
      System.out.println("枢軸と一致するグループ");
      for(int i=pr+1;i<=pl-1;i++){
        System.out.print(a[i]+" ");
      }
    }
    System.out.println("");
    System.out.println("枢軸以上のグループ");
    for(int i=pr+1;i<=n-1;i++){
      System.out.print(a[i]+" ");
    }*/
    return pl;
  }
  
  public static int shellsort(int[] X,int N){
    int count=0;
    int h;
    for(h=1;h<N/9;h=3*h+1){
      ;
    }
    
    for(;h>0;h/=3){
      for(int i=h;i<N;i++){
        int j;
        int tmp=X[i];
        for(j=i-h;j>=0&&tmp<X[j];j-=h){
          X[j+h]=X[j];
          count++;
        }
        X[j+h]=tmp;
        count++;
      }
    }
    return count;
  }
  
  public static int quicksort(int[] a,int start,int end){
	int pl=start;
    int pr=end-1;
    int x=a[pl];
    while(pl<=pr){
      while(x>a[pl])pl++;
      while(x<a[pr])pr--;
      if(pl<=pr) swap(a,pl++,pr--);
      count++;
    }
    
    if(start<pr) quicksort(a,start,pr);
    if(pl<end) quicksort(a,pl,end);
    
    return count;
  }
  
    public static int MAX2(int a,int b){
        return (a>b)?a:b;
    }
    
    public static int ABS(int a){
        return (a>0)?a:-a;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        
        int[][] DATA=new int[N][3];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<3;j++){
                DATA[i][j]=sc.nextInt();
            }
        }
        
        String[] CHECKER={"000","001","010","011","100","101","110","111"};
        Long MAX=0L;
        
        for(int i=0;i<8;i++){
            int[][] DATA_MOD=new int[N][3];
            
            for(int j=0;j<3;j++){
                if(CHECKER[i].charAt(j)=='1'){
                    for(int k=0;k<N;k++){
                        DATA_MOD[k][j]=-DATA[k][j];
                    }
                }else{
                    for(int k=0;k<N;k++){
                        DATA_MOD[k][j]=DATA[k][j];
                    }
                }
            }
            
            int[] ALLDATA=new int[N];
            
            for(int k=0;k<N;k++){
                for(int j=0;j<3;j++){
                    ALLDATA[k]+=DATA_MOD[k][j];
                }
            }
            
            
            int c=shellsort(ALLDATA,N);
            Long ANS=0L;
            
            for(int p=0;p<M;p++){
                ANS+=ALLDATA[N-1-p];
            }
            
            if(MAX<ANS) MAX=ANS;
        }
        
        System.out.println(MAX);
        
    }
}