import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int[][] s=new int[n][n];
        int[][] edges=new int[n];
        int edge=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s[i][j]=Integer.parseInt(sc.next());
                if(s[i][j]==1){
                    edge++;
                }
            }
            edges[i]=edge;
            edge=0;
        }
        int[] color=new int[n];
        Arrays.fill(color,-1);
        color[0]=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s[i][j]==1){
                    if(color[i]==0){
                        if(color[j]==-1){
                            color[j]=1;
                        }
                        else if(color[j]==0){
                            System.out.println("-1");
                            System.exit(0);
                        }
                    }
                    else if(color[i]==1){
                        if(color[j]==-1){
                            color[j]=0;
                        }
                        else if(color[j]==1){
                            System.out.println("-1");
                            System.exit(0);
                        }
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            if(color[i]==0){
                
            }
        }
    }
}