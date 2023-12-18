import java.io.*;
import java.util.*;
 
class Main {
    static char[][] maze = new char[2005][2005];
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        String st[] = br.readLine().split(" ");
        int H = Integer.parseInt(st[0]);
        int W = Integer.parseInt(st[1]);
        ArrayList<NoObstacle> noObstacles = new ArrayList<>();
        for(int i = 0; i < H; i++){
            String str = br.readLine();
            for(int j = 0; j < W; j++){
                maze[i][j] = str.charAt(j);
                if(maze[i][j] == '.'){
                    noObstacles.add(new NoObstacle(i, j));
                }
            }
        }
        int maxIlluminatedSquares = Integer.MIN_VALUE;
        for(int i = 0; i < noObstacles.size(); i++){
            int currRow = noObstacles.get(i).row;
            int currCol = noObstacles.get(i).column;
            int illuminatedSquares = 1;
            // go left
            for(int j = currCol - 1; j >= 0 && maze[currRow][j] != '#'; j--){
                illuminatedSquares++;
            }
            // go right
            for(int j = currCol + 1; j < W &&  maze[currRow][j] != '#'; j++){
                illuminatedSquares++;
            }
            // go up
            for(int j = currRow - 1; j >= 0 && maze[j][currCol] != '#'; j--){
                illuminatedSquares++;
            }
            // go down
            for(int j = currRow + 1; j < H && maze[j][currCol] != '#'; j++){
                illuminatedSquares++;
            }
            if(illuminatedSquares > maxIlluminatedSquares){
                maxIlluminatedSquares = illuminatedSquares;
            }
        }
        System.out.println(maxIlluminatedSquares);
    }
}
 
class NoObstacle {
    public int row, column;
    public NoObstacle(int row, int column){
        this.row = row;
        this.column = column;
    }
    public NoObstacle(){
        this.row = this.column = -1;
    }
}