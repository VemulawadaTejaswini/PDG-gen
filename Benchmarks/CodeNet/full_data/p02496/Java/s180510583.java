import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] box = new int [4][13];
		for(int k = 0; k < 4; k++){
			for(int j = 0; j < 13; j++){
				box[k][j] = 0;
			}	
		}
		int max = sc.nextInt();
		for(int i = 0; i < max; i++){
			char mark = sc.next().charAt(0);
			int a = sc.nextInt();
			if(mark == 'S')box[0][a] = 1;
			else if(mark == 'H')box[1][a] = 1;
			else if(mark == 'C')box[2][a] = 1;
			else if(mark == 'D')box[3][a] = 1;
        }
		for(int c = 0; c < 4; c++){
        	for(int d = 0; d < 13; d++){
        		if(box[c][d] == 0){
                    if(c == '0')System.out.printf("S %d\n",d);
                    else if(c == '1')System.out.printf("H %d\n",d);
                    else if(c == '2')System.out.printf("C %d\n",d);
                    else if(c == '3')System.out.printf("D %d\n",d);
        		}
        	}
		}
	}
}