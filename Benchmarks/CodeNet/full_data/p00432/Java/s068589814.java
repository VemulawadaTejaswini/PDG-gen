import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] Map = new boolean[10001][10001];
        while(true){
            String[] line = br.readLine().split(" ");
            int SheetNum = Integer.parseInt(line[0]);
            int AnswerType = Integer.parseInt(line[1]);
            if(SheetNum == 0 && AnswerType == 0) break;
            
            for(boolean[] row : Map) Arrays.fill(row, false);
            
            int MaxX = 0, MaxY = 0;
            int Area = 0;
            
            for(int i = 0; i < SheetNum; i++){
                String[] X1_Y1_X2_Y2 = br.readLine().split(" ");
                int X1 = Integer.parseInt(X1_Y1_X2_Y2[0]);
                int Y1 = Integer.parseInt(X1_Y1_X2_Y2[1]);
                int X2 = Integer.parseInt(X1_Y1_X2_Y2[2]);
                int Y2 = Integer.parseInt(X1_Y1_X2_Y2[3]);
                MaxX = MaxX < X2 ? X2 : MaxX;
                MaxY = MaxY < Y2 ? Y2 : MaxY;
                
                for(int y = Y1; y < Y2; y++){
                    for(int x = X1; x < X2; x++){
                        if(!Map[y][x]){
                            Map[y][x] = true;
                            Area++;
                        }
                    }
                }
            }
            System.out.println(Area);
            
            if(AnswerType != 2) continue;
            
            int SurroundLength = 0;
            for(int y = 0; y < MaxY; y++){
                for(int x = 0; x < MaxX; x++){
                    if(Map[y][x]){
                        try{
                            if(!Map[y-1][x]) SurroundLength++;
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            SurroundLength++;
                        }
                        try{
                            if(!Map[y+1][x]) SurroundLength++;
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            SurroundLength++;
                        }
                        try{
                            if(!Map[y][x-1]) SurroundLength++;
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            SurroundLength++;
                        }
                        try{
                            if(!Map[y][x+1]) SurroundLength++;
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            SurroundLength++;
                        }
                    }
                }
            }
            System.out.println(SurroundLength);
        }
    }
}