import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[3][3];
        boolean[][] flag = new boolean[3][3];
        int flag2 = 0;

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                num[i][j] = sc.nextInt();
                flag[i][j] = true;
            }
        }

        int cnt = sc.nextInt();
        int n = 0;

        while(cnt>n){
            int ans = sc.nextInt();
            for(int i = 0; i<3;i++){
                for(int j = 0;j<3;j++){
                    if(num[i][j]==ans){
                        flag[i][j]=false;
                    } 
                }
            }
            n++;
        }   


        if(flag[0][0]==flag[0][1] && flag[0][1]==flag[0][2] && flag[0][2]==false){
            flag2 = 1;
        }
        if(flag[1][0]==flag[1][1] && flag[1][1]==flag[1][2]&& flag[1][2]==false){
            flag2 = 1;
        }
        if(flag[2][0]==flag[2][1] && flag[2][1]==flag[2][2]&& flag[2][2]==false){
            flag2 = 1;
        }
        if(flag[0][0]==flag[1][0] && flag[1][0]==flag[2][0]&& flag[2][0]==false){
            flag2 = 1;
        }
        if(flag[0][1]==flag[1][1] && flag[1][1]==flag[2][1]&& flag[2][1]==false){
            flag2 = 1;
        }
        if(flag[0][2]==flag[1][2] && flag[1][2]==flag[2][2]&& flag[2][2]==false){
            flag2 = 1;
        }
        if(flag[0][0]==flag[1][1] && flag[1][1]==flag[2][2]&& flag[2][2]==false){
            flag2 = 1;
        }
        if(flag[0][2]==flag[1][1] && flag[1][1]==flag[2][0]&& flag[2][0]==false){
            flag2 = 1;
        }

        if(flag2 == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
