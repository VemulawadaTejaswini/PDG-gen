import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[3][3];


        for(int i=0;i<3;i++)for(int j=0;j<3;j++)bingo[i][j]=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(bingo[j][k]==b)bingo[j][k]=-1;
                }
            }
        }


        for(int i=0;i<3;i++){
            if(bingo[i][0]==-1&&bingo[i][1]==-1&&bingo[i][2]==-1) {
                System.out.println("Yes");
                return;
            }
            if(bingo[0][i]==-1&&bingo[1][i]==-1&&bingo[2][i]==-1){
                System.out.println("Yes");
                return;
            }
        }
        if(bingo[0][0]==-1&&bingo[1][1]==-1&&bingo[2][2]==-1){
            System.out.println("Yes");
            return;
        }
        if(bingo[2][0]==-1&&bingo[1][1]==-1&&bingo[0][2]==-1){
            System.out.println("Yes");
            return;
        }

        System.out.println("No");



    }
}


