
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // height
        int h = sc.nextInt();

        // width
        int w = sc.nextInt();
      	
      	//Bom
      	int m=sc.nextInt();

        // マス目の状態
        int[][] masu = new int[h][w];
      
      	int result[] = new int[h*w];
          
        //
      	int sumH[]=new int[h];
      	int sumW[]=new int[w];
      
      
      
      
      	int max_B=0;
          
          

        // 入力を受け取る
      	for(int i=0;i<h;i++){
          for(int j=0;j<w;j++){
            masu[i][j]=0;//初期化
          }
        }
      
      	for(int i=0;i<m;i++){
          int inputH = sc.nextInt();
          int inputW = sc.nextInt();
          masu[inputH-1][inputW-1]=1;
        }
      
      	//入力の確認
     	 /*
      	for(int i=0;i<h;i++){
          for(int j=0;j<w-1;j++){
            System.out.print(masu[i][j]);
          }
          System.out.println(masu[i][w-1]);
        }
        */
      
      
      	//結果の初期化
      	for(int i=0;i<h*w;i++){
          result[i]=0;
        }
      
      	for(int i=0;i<h;i++){
          for(int j=0;j<w;j++){
              sumH[i]+=masu[i][j];//横のボム
          }
        }
      
            
      	for(int i=0;i<w;i++){
          for(int j=0;j<h;j++){
              sumW[i]+=masu[j][i];//縦のボム
          }
        }
      
      	
      
      
      	for(int i=0;i<h;i++){
          for(int j=0;j<w;j++){
			result[i*w+j]=sumH[i]+sumW[j]-masu[i][j];//かぶった部分
          }
      	}
      
      	for(int i=0;i<h*w;i++){//最大値の検索
          if(max_B<=result[i]){
          	max_B=result[i];
          }
        }
      
      	System.out.println(max_B);
      
    }
}