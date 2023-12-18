import java.util.*;



public class Main{
    static Scanner sc=new Scanner(System.in);
    static int N=sc.nextInt();
    static int C=sc.nextInt();
    static int[][]D=new int[C][C];
    static int[][]c=new int[N][N];
    public static void main(String[] args){
        for(int i=0;i<C;i++){
            for(int j=0;j<C;j++){
                D[i][j]=sc.nextInt();
            }
        }
        int[][]kazu=new int[3][50];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                c[i][j]=sc.nextInt()-1;
                kazu[(i+j)%3][c[i][j]]++;

            }
        }
        
        int ans=334334;
        for(int i=0;i<C;i++){
            for(int j=0;j<C;j++){
                for(int k=0;k<C;k++){
                    if(i==j||j==k||i==k) continue;
					int res = 0;
					for(int m = 0; m < C; m++) {
						res += kazu[0][m]*D[m][i];
						res += kazu[1][m]*D[m][j];
						res += kazu[2][m]*D[m][k];
					}
					ans = Math.min(ans, res);
                }
            }
        }
        System.out.println(ans);


        
        

            

        
        
        
        
            

        
        

    }
    }
