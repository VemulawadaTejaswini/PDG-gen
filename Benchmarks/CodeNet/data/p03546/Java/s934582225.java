import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] imparray = new int[10][10];
		int retmpsum = 0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				imparray[i][j] = sc.nextInt();
			}
		}
		for(int x=0;x<10;x++){
			for(int y=0;y<10;y++){
				for(int z=0;z<10;z++){
					if(imparray[y][z] > imparray[y][x] + imparray[x][z]){
						imparray[y][z] = imparray[y][x] + imparray[x][z];
					}
				}
			}
		}
		for(int wh=0;wh<h;wh++){
			for(int ww=0;ww<w;ww++){
				int wint = sc.nextInt();
				if(wint!=-1){
					retmpsum += imparray[wint][1];					
				}
			}
		}
		System.out.println(retmpsum);
    }
}
