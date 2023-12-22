import java.util.*;
public class Main{
     static int M,N;
        public static void main(String[] a)throws java.io.IOException{
            Scanner sc=new Scanner(System.in);
            while(sc.hasNextInt()){
                    N=sc.nextInt();
                    M=sc.nextInt();
                    if(N==0||M==0)break;
                    int ans =0;
                    int [][] fin =new int[M][N];
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N ;j++){
                            fin[i][j] = sc.nextInt();
                        }
                    }
  
                    
                    
                    
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N;j++){
                            if(fin[i][j] == 1){
                                ++ans;
                                temp(i,j,fin);
  
                            }
                        }
                    }
                    
                    
                    
                    
                    System.out.println(ans);
                    sc.nextLine();
            }
    }
  
  
          public static void temp(int y,int x,int [][] fin){
              fin[y][x] = 0;
              for(int i=-1;i<=1;i++){
                  for(int j=-1;j<=1;j++){
                  int n1 =x+j;
                  int n2 =y+i;
                  if(0<=n1 && n1< N &&0<=n2 && n2 <M &&fin[n2][n1]==1)
                      temp(n2,n1,fin);
                  }
              }
              return;
          }
}