    import java.util.ArrayDeque;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Deque;
    import java.util.List;
    import java.util.Scanner;

    //
    public class Main {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arrys_bingo;
        arrys_bingo = new int [4][4];

        String strs="No";

        int [][] arrys_bingo_result;
        arrys_bingo_result = new int [4][4];


        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){arrys_bingo[i][j]=sc.nextInt();}
        }

        int N = sc.nextInt();
        int [] arrys_n;
        arrys_n = new int [N+1];
        for(int i=1;i<=N;i++){
        arrys_n[i] = sc.nextInt();
        }

        //ビンゴ結果
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                arrys_bingo_result[i][j]=0;
                for(int k=1;k<=N;k++){
                    if(arrys_bingo[i][j]==arrys_n[k]){
                        arrys_bingo_result[i][j]=1;
                    }
                }

            }
        }

        int [] tatekakka;
        tatekakka = new int [4];
        int [] yokokekka;
        yokokekka = new int [4];
        int [] nanamekekka;
        nanamekekka = new int [4];


        //ビンゴ判定1
        for(int i=1;i<=3;i++){
        yokokekka[i]=1;
            for(int j=1;j<=3;j++){
                if(arrys_bingo_result[i][j]==0){
                    yokokekka[i]=0;
                }
            }
        }
        //ビンゴ判定2
        for(int i=1;i<=3;i++){
        tatekakka[i]=1;
            for(int j=1;j<=3;j++){
                if(arrys_bingo_result[j][i]==0){
                    tatekakka[i]=0;
                }
            }
        }
        //ビンゴ判定3
        for(int i=1;i<=3;i++){
        nanamekekka[i]=1;
                if((arrys_bingo_result[i][i]==0)||(arrys_bingo_result[i][4-i]==0)){
                    nanamekekka[i]=0;
                }
        }

        for(int i=1;i<=3;i++){
            if((yokokekka[i]==1)||(tatekakka[i]==1)||(nanamekekka[i]==1)){
            strs="yes";}
        }

        System.out.println(strs);
        }
    }