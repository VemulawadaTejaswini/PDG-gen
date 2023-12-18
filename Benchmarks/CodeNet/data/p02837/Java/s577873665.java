import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int List2 [][] = new int[N][N];
        int max =0;

        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            for(int j=0;j<A;j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                List2[x-1][i]=y+1;
            }
        }
        for(int i=0;i<N;i++){
            int []List3 = new int[N];
            int List [] = new int[N];
            List[i]=2;
            List3[i]=1;
            for(int j=0;j<N;j++) {
                if(List2[j][i]==2) List[j]=2;
                else if(List2[j][i]==1) List[j]=1;
            }
            boolean check = true;

           whole: for(int j=0;j<N;j++){
                if(List[j]==2&&List3[j]==0){
                    List3[j]=1;
                    for(int k=0;k<N;k++){
                        if (List2[k][j] != 0) {
                            if(List2[k][j]!=List[k]) {
                                check = false;
                                break whole;
                            }
                            else List[k]=List2[k][j];

                        }
                    }
                    j=0;
                }
            }
            if(check){
                int num = 0;
                for(int j=0;j<N;j++)if(List[j]==2) num++;
                if(num>max) max=num;
            }
        }
        System.out.println(max);
    }
}