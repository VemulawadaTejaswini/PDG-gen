import java.util.*;
/*ダイスゲーム：東西南北に転がした時の上の目は？
*/
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
/*
        int upper = sc.nextInt();
        int front = sc.nextInt();
        int right = sc.nextInt();
        int left = sc.nextInt();
        int back = sc.nextInt();
        int downSide = sc.nextInt();
*/        
//リストにｃｕｂｅの数字を受取る
/*検証用
        int [] cubeNum = new int [6];     
        for(int i=0; i<6; i++){
            cubeNum[i] = i+1;
        }
*/        
        int [] cubeNum = new int [6];     
        for(int i=0; i<6; i++){
            cubeNum[i] = sc.nextInt();
        }
        
        String direction =sc.next();
        int compassNum = direction.length();
        String[] compass =direction.split("");   
    
        for(int i = 0; i < compassNum; i++){
             if(("S").equals(compass[i])){
                 int forNow = cubeNum[0];//１つ回避
                 cubeNum[0]= cubeNum[4];
                 cubeNum[4]= cubeNum[5];
                 cubeNum[5]= cubeNum[1];
                 cubeNum[1]= forNow;
             }else if(("N").equals(compass[i])){
                 int forNow = cubeNum[0];
                 cubeNum[0]= cubeNum[1];
                 cubeNum[1]= cubeNum[5];
                 cubeNum[5]= cubeNum[4];
                 cubeNum[4]= forNow;
             }else if(("E").equals(compass[i])){
                 int forNow = cubeNum[0];
                 cubeNum[0]= cubeNum[3];
                 cubeNum[3]= cubeNum[5];
                 cubeNum[5]= cubeNum[2];
                 cubeNum[2]= forNow;
             }else if(("W").equals(compass[i])){
                 int forNow = cubeNum[0];
                 cubeNum[0]= cubeNum[2];
                 cubeNum[2]= cubeNum[5];
                 cubeNum[5]= cubeNum[3];
                 cubeNum[3]= forNow;
             }

    } System.out.println(cubeNum[0]);
    /*
System.out.println(cubeNum[1]);
System.out.println(cubeNum[2]);
System.out.println(cubeNum[3]);
System.out.println(cubeNum[4]);
System.out.println(cubeNum[5]);
*/
}
}
/*
        [1]         
     [4][2][3][5]
        [6]          
upper / front  back / downSide
[0][1][2][3][4][5]
[1][2][3][4][5][6]
[u][f][r][l][b][d]
Ｓ：
[0][1][2][3][4][5]
[5][1][3][4][6][2]
　　↑
[b][u][r][l][d][f]
[4][0][2][3][5][1]
Ｎ：
[0][1][2][3][4][5]
[2][6][3][4][1][5]
　　↑
[f][d][r][l][u][b]
[1][5][2][3][0][4]
Ｅ：
[0][1][2][3][4][5]
[4][2][1][6][5][3]
　　↑
[l][f][u][d][b][r]
[3][1][0][5][4][2]
Ｗ：
[0][1][2][3][4][5]
[3][2][6][1][5][4]
　　↑
[r][f][d][u][b][l]
[2][1][5][0][4][3]

*/
