import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();


            int h[]=new int[n];
            for(int i=0;i<n;i++){
                h[i]=sc.nextInt();
            }
            int connect[][]=new int[n][n];

            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    connect[i][j]=0;
                }
            }

int x,y;
            for (int j=0;j<m;j++){
                x=sc.nextInt();
                y=sc.nextInt();
               /* for (int k=0;k<n;k++){
                    if (x==(k+1)){
                        connect[k][y-1]=1;
                    }
                    if (y==(k+1)){
                        connect[k][x-1]=1;
                    }
                }*/
               /*System.out.print(x);
                System.out.println(y);*/
               connect[y-1][x-1]=1;
               connect[x-1][y-1]=1;

            }
            int num=0;
            for (int i=0;i<n;i++){
                int judge=1;
                for (int j=0;j<n;j++){
                    if(connect[i][j]==1){
                        if(h[i]<=h[j]){
                            judge=0;
                        }
                    }
                }
                if (judge==1){
                    num++;

                }
            }

            System.out.println(num);




    }
}
