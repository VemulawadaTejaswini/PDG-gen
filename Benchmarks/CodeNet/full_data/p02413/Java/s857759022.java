import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        	int r = scan.nextInt();
        	int c = scan.nextInt();
        	int [][]sheet;
        	sheet = new int[(r+1)][(c+1)];
        	int sheetr,sheetc;

        	for(sheetr = 0; sheetr < r; sheetr++){
        		for(sheetc = 0; sheetc < c; sheetc++){
        		sheet[sheetr][sheetc] = scan.nextInt();
        		}
        	}
        	for(sheetr = 0; sheetr < r; sheetr++){
        		for(sheetc = 0; sheetc < c; sheetc++){        			
        		sheet[sheetr][c] += sheet[sheetr][sheetc];
        		}
        	}
        	for(sheetc = 0; sheetc <= c; sheetc++){
        		for(sheetr = 0; sheetr < r; sheetr++){
        		sheet[r][sheetc] += sheet[sheetr][sheetc];
        		}
        	}
        	for(sheetr = 0; sheetr <= r; sheetr++){
        		for(sheetc = 0; sheetc <= c; sheetc++){ 
        			if(sheetc < c){
        				System.out.print(sheet[sheetr][sheetc]+" ");
        			}
        			else if(sheetc == c){
        			System.out.print(sheet[sheetr][sheetc]);
        			}
        			if(sheetc == c){
        				System.out.print("\r\n");
        			}
        		}
        	}
    }
}