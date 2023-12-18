import java.util.*;

class Main {
    static char[][] maze = new char[2005][2005];
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int H = scn.nextInt();
        int W = scn.nextInt();
        ArrayList<NoObstacle> noObstacles = new ArrayList<>();
        for(int i = 0; i < H; i++){
            String str = scn.next();
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
        scn.close();
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