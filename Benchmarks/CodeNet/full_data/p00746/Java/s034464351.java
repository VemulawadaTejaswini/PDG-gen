import java.util.*;
class Main{
    public static void main (String [] args){
	Scanner sc = new Scanner (System.in);
	int count = sc.nextInt();
	while (count > 0) {
	    Square square = new Square();
	    for(int i = 0; i < count - 1; i++){
		square.setSquare(sc.nextInt(),sc.nextInt());
	    }
	    System.out.println(square.width() + " " + square.height());
	    count = sc.nextInt();	
	} 
    }
}

class Square{
    int[][] square;
    int squareNumber;
    public static final int left = 0;
    public static final int down = 1;
    public static final int right = 2;
    public static final int up = 3;

    Square(){
        square = new int[400][400];
	for(int i = 0;i<square.length;i++){
	    for(int j = 0 ; j < square[i].length ; j ++){
		square[i][j] = -1;	 
	    }
	} 
	square[square.length/2][square.length/2] = 0; 
	squareNumber = 1;
    }
    void setSquare(int number, int direction){
	for(int i = 0; i < square.length ;i++){
	    for(int j = 0 ; j <square[i].length ; j++ ){
		if(square[i][j] == number){
		    switch (direction) {
		    case left:
			square[i-1][j] = squareNumber;
			break;
		    case down:
			square[i][j-1] = squareNumber;
			break;
		    case right:
			square[i+1][j] = squareNumber;
			break;
		    case up:
			square[i][j+1] = squareNumber;
			break;		    
		    }
		    squareNumber++;
		    return;
		}
	    }
	}
    }

    int height(){
	int heightMax = 0;
	for(int i = 0; i < square.length ; i++){
	    int height = 0;
	    for(int j = 0; j < square[i].length ; j++){
		if (square[i][j] >= 0) {
		    height++;
		}
	    }
	    if (heightMax < height) {
		heightMax = height;
	    }
	}
	return heightMax;
    }
    int width(){
	int widthMax = 0;
	for(int j = 0 ; j <square[0].length; j++){
	    int width = 0;
	    for(int i = 0 ; i< square.length ; i++) {
		if (square[i][j] >= 0) {
		    width++;
		}
	    }
	    if (widthMax < width ) widthMax = width;
	}
	return widthMax;
    }

}