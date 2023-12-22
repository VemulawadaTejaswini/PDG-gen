/*
このコードではゴールから何回のワープでたどり着ける地点かをmapに記載していく
startがwarp何回の領域かわかった時点で終了
*/



import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();// 行
      	int w = sc.nextInt();// 列
		int c_H = sc.nextInt();// スタート行      
		int c_W = sc.nextInt();// スタート列
		int d_H = sc.nextInt();// ゴール行      
		int d_W = sc.nextInt();// ゴール列
		int map[][]=new int[h+4][w+4];
      	int next=1;
      	int warp=0;//現在のワープ回数
      	int load=0;//道の数を確認
      
      
      	for(int i=0;i<h+4;i++){
          for(int j=0;j<w+4;j++){
            map[i][j]=-3;//場外は-3
          }
        }
      
      	for(int i=2;i<h+2;i++){//マップの入力
          String input = sc.next();
          for(int j=2;j<w+2;j++){
            if(input.charAt(j-2)=='#'){
              map[i][j]=-1;//壁を-1
            }
            if(input.charAt(j-2)=='.'){
              map[i][j]=-2;//まだたどり着いてない道を-2
              load+=1;
            }
          }
        }
      
      	map[d_H+1][d_W+1]=0;//goalを0
	
/*
      	for(int i=0;i<h+4;i++){
          for(int j=0;j<w+3;j++){
         	System.out.print(map[i][j]+"　");
          }
          System.out.println(map[i][w+3]);
        }
*/ //マップの入力がうまくいってることの確認      
      
     	while(map[c_H+1][c_W+1]==-2){
          while(next==1){//warpが必要か
            
            next=0;
          	for(int i=2;i<h+2;i++){
              for(int j=2;j<w+2;j++){
              
              	if(map[i][j]==warp){
                  //System.out.println("しっかり動作しているか確認");
                  if(map[i][j+1]==-2){//隣接マスの塗りつぶし
                  	map[i][j+1]=warp;
                  	next=1;
                  }
                  if(map[i][j-1]==-2){
                  	map[i][j-1]=warp;
                  	next=1;
                  }
                  if(map[i+1][j]==-2){
                  	map[i+1][j]=warp;
                  	next=1;
                  }
                  if(map[i-1][j]==-2){
                    map[i-1][j]=warp;
                  	next=1;
                  }
                  
     
                }
                
              }
            }
          }
          for(int i=2;i<h+2;i++){//warp先の探査
            for(int j=2;j<w+2;j++){
              if(map[i][j]==warp){  
                for(int k=i-2;k<i+3;k++){
                  for(int l=j-2;l<j+3;l++){
                    if(map[k][l]==-2){
                      map[k][l]=warp+1;
                    }
                  } 
                }
              }
            }
          }
          
            warp+=1;
            next=1;
          if(warp>=load){//たどり着けない場合の処理
            map[c_H+1][c_W+1]=-1;
            break;
          }
        }

      
      System.out.println(map[c_H+1][c_W+1]);

      
     
      /*for(int i=0;i<h+4;i++){
      	for(int j=0;j<w+3;j++){
         System.out.print(map[i][j]+"　");
      	}
        System.out.println(map[i][w+3]);
      }*/
 //マップの確認      
      
    } 
}

























