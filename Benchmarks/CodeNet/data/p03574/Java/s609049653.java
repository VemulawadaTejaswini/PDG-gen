import java.util.*;
//System.out.println("")

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); 
        int w = sc.nextInt();
        int[] x = {-1, -1, -1, 0, +1, +1, +1, 0};
        int[] y = {-1, 0, +1, +1, +1, 0, -1, -1};
        
        char[][] map = new char[h][w];
        for(int i=0; i<h; i++){
            map[i] = sc.nextLine().toCharArray();
        }
        
        for(int i=0; i<h; i++){
            for(int j=0; i<w; j++){
                int cnt = 0;
                if(map[i][j] == '.'){
                    for(int k=0; k<8; k++){
                        if(i+x[k]>=0 && i+x[k]<h && j+y[k]>=0 && j+y[k]<w){
                            if(map[i + x[k]][j + y[k]] == '#'){
                                cnt++;
                            }
                        }
                    }
                 map[i][j] = (char)(cnt+ '0');   
                }
                System.out.print(map[i][j]); //横に並べていく
            }
            System.out.println("");
        }
        
    }
}