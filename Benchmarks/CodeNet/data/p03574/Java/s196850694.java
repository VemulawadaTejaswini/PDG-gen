import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();//マス目の設定
        int W = sc.nextInt();
        String[][] map;
      	map=new String [H][W];
      	result=new int[H][W];
       	
      
      	for(int i=0;i<H;i++) {//データの打ち込み
          for(int j=0;j<W;j++){
			map[i][j]=sc.next();
          }
		}
     	for(int i=0;i<H;i++) {//データの打ち込み
          for(int j=0;j<W;j++){
			result[i][j]=-1;
          }
		}
      
      	for(int i=0;i<H;i++) {//変換
          for(int j=0;j<W;j++){
           	if(map[i][j]=="."){
              result[H][W]="0";
              
              if(map[i][j+1]=="#"){
				result[i][j]+=1;
              }
              if(map[i][j-1]=="#"){
				result[i][j]+=1;
              }
              if(map[i+1][j]=="#"){
				result[i][j]+=1;
              }
              if(map[i-1][j]=="#"){
				result[i][j]+=1;
              }
              if(map[i+1][j+1]=="#"){
				result[i][j]+=1;
              }
              if(map[i-1][j+1]=="#"){
				result[i][j]+=1;
              }
              if(map[i+1][j-1]=="#"){
				result[i][j]+=1;
              }
              if(map[i-1][j-1]=="#"){
				result[i][j]+=1;
              }
              
           	}
          }
		}
      
      
      for(int i=0;i<H;i++) {//データの書き出し
        for(int j=0;j<W-1;j++){
          if(result[i][j]==-1){
			System.out.print(map[i][j]);
          }else{
          	System.out.print(result[i][j]);
          }
        }
      }  
		if(result[i][W]==-1){
		  System.out.println(map[i][W]);
        }else{
          System.out.println(result[i][W]);
        } 
        
	  
      
    }
}
