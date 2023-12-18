import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();//マス目の設定
        int W = sc.nextInt();
        String[][] map;
      	map=new String [H][W];
       	
      
      	for(int i=0;i<H;i++) {//データの打ち込み
          for(int j=0;j<W;j++){
			map[i][j]=sc.next();
          }
		}
      
      	for(int i=0;i<H;i++) {//変換
          for(int j=0;j<W;j++){
           	if(map[i][j]=="."){
              map[i][j]=0;
              
              if(map[i][j+1]=="#"){
				map[i][j]+=1;
              }
              if(map[i][j-1]=="#"){
				map[i][j]+=1;
              }
              if(map[i+1][j]=="#"){
				map[i][j]+=1;
              }
              if(map[i-1][j]=="#"){
				map[i][j]+=1;
              }
              if(map[i+1][j+1]=="#"){
				map[i][j]+=1;
              }
              if(map[i-1][j+1]=="#"){
				map[i][j]+=1;
              }
              if(map[i+1][j-1]=="#"){
				map[i][j]+=1;
              }
              if(map[i-1][j-1]=="#"){
				map[i][j]+=1;
              }
              
           	}
          }
		}
      
      
      for(int i=0;i<H;i++) {//データの書き出し
        for(int j=0;j<W-1;j++){
			System.out.print(map[i][j]);
        }
		System.out.println(map[i][W]);
	  }
      
    }
}
