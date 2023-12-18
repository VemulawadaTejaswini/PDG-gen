import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        String[] s = new String[H];
        for(int i = 0; i < H; i++){
          s[i] = sc.next();
        }
      
        if(H==1 || M==1){
          if(H==1 && M==1){
            if(s[0].equals("#")){
              System.out.println("#");
            }else{
              System.out.println(0);
            }
          }else if(H==1 && M!=1){
            char[] ha = s[0].toCharArray();
            int[] hai = new int[ha.length];
            for(int i = 0; i < ha.length; i++){
              if(ha[i] == '#'){
                hai[i] = 50;
              }else{
                hai[i] = 0;
              }
            }
            for(int j = 1; j < ha.length-1;j++){
              if(hai[j] >= 50){
                hai[j-1]++;
                hai[j+1]++;
              }
            }
            
            if(hai[hai.length-1] >= 50){
              hai[hai.length-2]++;
            }
            for(int k = 0; k < hai.length; k++){
              if(hai[k] >= 50){
                System.out.print('#');
              }else{
                System.out.print(hai[k]);
              }
            }
            System.out.println();
          }else if(H!=1 && M==1){
            int[] oi = new int[H];
            for(int i = 0; i < H; i++){
              if(s[i].equals("#")){
                oi[i] = 50;
              }else{
                oi[i] = 0;
              }
            }
            for(int m = 1; m <= H-2;m++){
              if(oi[m] >= 50){
                oi[m-1]++;
                oi[m+1]++;
              }
            }
            
            if(oi[H-1] >= 50){
              oi[H-2]++;
            }
            for(int l = 0; l < H; l++){
              if(oi[l] >= 50){
                System.out.println('#');
              }else{
                System.out.println(oi[l]);
              }
            }
            System.out.println();
          }
        }else{
        int[][] hm = new int[H][M];
        for(int i = 0; i < H; i++){
          for(int j = 0; j < M ; j++){
            if(s[i].charAt(j) == '.'){
              hm[i][j] = 0;
            }else{
              hm[i][j] = 50;
            }
           
          }
        }
      
        for(int i = 0; i < H; i++){
            for(int j = 0; j < M ; j++){
              if(i==0 && j==0){ //左上端用
                if(hm[i][j+1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j+1] >= 50){
                  hm[i][j]++;
                }
              }else if(i==0 && j==M-1){ //右上端用
                if(hm[i][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 50){
                  hm[i][j]++;
                }
              }else if(i==H-1 && j==0){ //左下端用
                if(hm[i-1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j+1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 50){
                  hm[i][j]++;
                }
              }else if(i==H-1 && j==M-1){ //右下端用
                if(hm[i-1][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i][j-1] >= 50){
                  hm[i][j]++;
                }
              }else if(j==0 && i!=0 && j==0 && i!=H-1){ //左用
                if(hm[i-1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j+1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j+1] >= 50){
                  hm[i][j]++;
                }
              }else if(j==M-1 && i!=0 && j==M-1 && i!=H-1){ //右用
                if(hm[i-1][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 50){
                  hm[i][j]++;
                }
              }else if(i==0 && j!=0 && i==0 && j!=M-1){ //上用
                if(hm[i][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j+1] >= 50){
                  hm[i][j]++;
                }
              }else if(i==H-1 && j!=0 && i==H-1 && j!=M-1){ //下用
                if(hm[i][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j+1] >= 50){
                  hm[i][j]++;
                }
              }else{ //その他用
                if(hm[i-1][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i-1][j+1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j-1] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 50){
                  hm[i][j]++;
                }
                if(hm[i+1][j+1] >= 50){
                  hm[i][j]++;
                }
              }
               
            }
        }
      
            for(int i = 0; i < H; i++){
              for(int j = 0; j < M ; j++){
                if(hm[i][j] >= 50){
                  System.out.print("#");
                }else{
                System.out.print(hm[i][j]);
                }
              }
              System.out.println();
            }
        }
	}
}