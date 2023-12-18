import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] mine = new char[H+2][W+2];
        for(int i = 1; i <= H; i++){
            String s = sc.next();
            for(int j = 1; j <= W; j++){
                mine[i][j] = s.charAt(j-1);
            }
        }
        sc.close();

        for(int i = 1; i <= H; i++){
            for(int j = 1; j <= W; j++){
                if(mine[i][j] == '.'){
                    int count = 0;
                    if(mine[i-1][j-1] == '#')
                            count++;
                    if(mine[i][j-1] == '#')
                        count++;
                    if(mine[i+1][j-1] == '#')
                        count++;
                    if(mine[i-1][j] == '#')
                        count++;
                    if(mine[i][j] == '#')
                        count++;
                    if(mine[i+1][j] == '#')
                        count++;
                    if(mine[i-1][j+1] == '#')
                        count++;
                    if(mine[i][j+1] == '#')
                        count++;
                    if(mine[i+1][j+1] == '#' )
                        count++;
                    mine[i][j] = String.valueOf(count).charAt(0);
                }
                System.out.print(mine[i][j]);
            }
            System.out.println();
        }
    }
}