import java.util.*;
import java.lang.*;

class Point{
    int x;
    int y;
    Point(int a,int b){
        this.x = a;
        this.y = b;
    }
}


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int H = sc.nextInt();
            int W = sc.nextInt();

            String[][] S = new String[H][W];
            int black = 0;
            for(int i = 0 ; i < H ; i++){
                String tmp = sc.next();
                for(int j = 0 ; j < W ; j++){
                    S[i][j] = tmp.substring(j,j+1);
                    if(S[i][j].equals("#")){
                        black++;
                    }
                }
            }
            sc.close();
            int count = 0;
            int[] dx = {1,0,-1,0};
            int[] dy = {0,1,0,-1};
            
            boolean flag = true;
            outside:
            for(int i = 0 ; i < H ; i++){
                for(int j = 0 ; j < W ; j++){
                    for(int k = 0 ; k < 4 ; k++){
                        int x = i+dx[k];
                        int y = j+dy[k];
                        
                        if(x >= 0 && x < H && y >= 0 && y < W){
                            if(S[i][j].equals("#") && S[x][y].equals(".")){
                                count++;
                            }
                        }

                    }
                  //  System.out.println(i + " " + j + " " + count);
                    if(i > 0 && j > 0 && count == 4){
                        flag = false;
                        break outside;
                    }
                    else if(i == 0 && j == 0 && count == 2|| i == 0 && j == W-1 && count == 2|| i == H-1 && j == 0 && count == 2|| i == H-1 && j == W-1&& count == 2){
                        flag = false;
                        break outside;
                    }
                    else if(i == 0 && count == 3 || j == 0 && count == 3){
                        flag = false;
                        break outside;    
                    }
                    else{
                        count=0;
                        if(i == H-1 && j == W-1){
                            break outside;
                        }
                    }

                }
            }

            if(flag){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
   }

