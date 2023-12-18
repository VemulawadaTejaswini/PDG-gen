import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int H,W;
H = sc.nextInt();
W = sc.nextInt();
String[][] S = new String[H][W];
for(int i = 0;i<H;i++){
    for(int j=0;j<W;j++){
        S[i][j]=sc.next();
    }
}

//入力値変換
int numberofwhite=0;
int numberofblack=0;
for(int i = 0;i<H;i++){
    for(int j=0;j<W;j++){
        if(S[i][j].equals(".")){
            numberofwhite++;
        }else{
            numberofblack++;
        }
    }
}

int[][] count = new int[H][W];
for(int i = 0;i<H;i++){
    for(int j=0;j<W;j++){
        count[i][j]=-1;
    }
}
count[0][0]=0;


//出力変数
int ans=0;

//計算
for(int k=1;count[H-1][W-1]==-1&&k<H*W;k++){
    for(int i=0;i<H;i++){
        for(int j=0;j<W;j++){
            if(count[i][j] == k-1){
                if(0<=i-1){
                    if(count[i-1][j]==-1&&S[i-1][j].equals(".")){
                    count[i-1][j]=k;
                    }
                }
                if(i+1<H){
                    if(count[i+1][j]==-1&&S[i+1][j].equals(".")){
                    count[i+1][j]=k;
                    }
                }
                if(0<=j-1){
                    if(count[i][j-1]==-1&&S[i][j-1].equals(".")){
                    count[i][j-1]=k;
                    }
                }
                if(j+1<W){
                    if(count[i][j+1]==-1&&S[i][j+1].equals(".")){
                    count[i][j+1]=k;
                    }
                }
            }
        }
    }
}
if(count[H-1][W-1]==-1){
    ans=-1;
}else{
    ans=H*W-count[H-1][W-1]-1; 
}

//出力
System.out.println(ans);

}}