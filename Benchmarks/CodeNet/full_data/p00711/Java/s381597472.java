import java.util.Scanner;

public class Main {

	static int a,b;
    static int[][] tile;
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);

        while(true){
            b=s.nextInt();
            a=s.nextInt();
            if(a==0)System.exit(0);
            tile=new int[a][b];
            String now;
            int p=0,q=0;
            for(int i=0;i<a;i++){
                now=s.next();
                for(int j=0;j<b;j++){
                    if(now.charAt(j)=='#')tile[i][j]=0;
                    else if(now.charAt(j)=='.')tile[i][j]=1;
                    else{
                        tile[i][j]=0;
                        p=i;
                        q=j;
                    }
                }
            }


            System.out.println(solve(p,q));
        }
    }
    static int solve(int m,int n){
        int count=0;

        tile[m][n]=0;

        if(m>0)
            if(tile[m-1][n]==1)count+=solve(m-1,n);
        if(m<a-1)
            if(tile[m+1][n]==1)count+=solve(m+1,n);
        if(n>0)
            if(tile[m][n-1]==1)count+=solve(m,n-1);
        if(n<b-1)
            if(tile[m][n+1]==1)count+=solve(m,n+1);


        return count+1;
    }

}

