import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int h = sc.nextInt();
        int w = sc.nextInt();
        int count;
        String mine[][] = new String[h][w];
        String tmp;
        for(int i = 0;i < h; i++){
          tmp = sc.next();
          mine[i] = tmp.split("");
        }
        for(int i = 0; i < h;i++){
          for(int j = 0; j < w;j++){
            count = 0;
            if(!mine[i][j].equals("#")){
              //左上
              if(i == 0 && j == 0){
                if(mine[i][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j + 1].equals("#")){
                  count += 1;
                }
              //右上
              }else if(i == 0 && j == w - 1){
                if(mine[i][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j - 1].equals("#")){
                  count += 1;
                }
              //左下
              }else if(i == h - 1 && j == 0){
                if(mine[i][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j + 1].equals("#")){
                  count += 1;
                }
              //右下
              }else if(i == h - 1 && j == w - 1){
                if(mine[i][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j - 1].equals("#")){
                  count += 1;
                }
              //上辺
              }else if(i == 0 && j != 0 && j != w - 1){
                if(mine[i][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j + 1].equals("#")){
                  count += 1;
                }
              //左辺
              }else if(j == 0 && i != 0 && i != h - 1){
                if(mine[i - 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j + 1].equals("#")){
                  count += 1;
                }
              //下辺
              }else if(i == h - 1 && j != 0 && j != w - 1){
                if(mine[i][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j + 1].equals("#")){
                  count += 1;
                }
              //右辺
              }else if(j == w - 1 && i != 0 && i != h - 1){
                if(mine[i - 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j - 1].equals("#")){
                  count += 1;
                }
              //それ以外
              }else{
                if(mine[i - 1][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j].equals("#")){
                  count += 1;
                }
                if(mine[i - 1][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i + 1][j].equals("#")){
                  count += 1;
                }                     
                if(mine[i + 1][j - 1].equals("#")){
                  count += 1;
                }
                if(mine[i][j + 1].equals("#")){
                  count += 1;
                }
                if(mine[i][j - 1].equals("#")){
                  count += 1;
                }
              }
              mine[i][j] = Integer.toString(count);
            }
          }
        }
      
      
        for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(mine[i][j]);
			}
			System.out.println();
		}
        
    }
}