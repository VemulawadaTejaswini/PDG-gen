import java.util.Scanner;

public class Main {

	private static int[][] board = new int[10][10];

	private static final int SMALL  = 1,
			                 MEDIUM = 2,
			                 LARGE  = 3;


    public static void main(String[] args) {

		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				board[i][j] = 0;
			}
		}

        Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

        String[] s;
        while(sc.hasNext()){
        	s = sc.next().split(",");
        	update_board(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
        }
        System.out.println(cnt_0_cell());
        System.out.println(max_cell());
    }

    private static void update_board(int x,int y,int size){

		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if((((i == x && (j <= y + 1 &&  j >= y - 1)) || ((i <= x + 1 &&  i >= x - 1) && j == y)) && size == SMALL)  ||
				  (              j <= y + 1 &&  j >= y - 1   &&   i <= x + 1 &&  i >= x - 1              && size == MEDIUM) ||
				  ((             j <= y + 1 &&  j >= y - 1   &&   i <= x + 1 &&  i >= x - 1            ) ||
					            (i == x     &&  j == y - 2)  || ( i == x     &&  j == y + 2)             ||
					            (i == x - 2 &&  j == y    )  || ( i == x + 2 &&  j == y    )   		   ) && size == LARGE)
					{board[i][j]++;}
			}
		}
    }

    private static int cnt_0_cell(){
    	int sum = 0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(board[i][j] == 0){sum++;}
			}
		}
		return sum;
    }

    private static int max_cell(){
    	int max = 0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(max < board[i][j]){max = board[i][j];}
			}
		}
		return max;
    }

}