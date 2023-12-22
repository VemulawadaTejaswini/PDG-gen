import java.util.Scanner;

public class Main {

	static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = 0,h = 0;
		String str = "";
		int firstX = 0,firstY = 0;

		while(sc.hasNext()){
			
			count = 0;
			w = sc.nextInt();
			h = sc.nextInt();
			
			if(w == 0 && h == 0) break;
			
			char[][] tiles = new char[h][w];
			
			// テ」ツつソテ」ツつ、テ」ツδォテ、ツスツ愿ヲツ按?
			for(int i = 0;i<h;i++){
				str = sc.next();
				for(int j = 0;j<w;j++){
					tiles[i][j] = str.charAt(j);
					if(tiles[i][j]=='@'){
						firstX = j; 
						firstY = i;
					}
				}
			}
			
			// テ・ツ?催・ツクツーテゥツ鳴凝・ツァツ?
			walkTiles(firstY,firstX,tiles);
			
			System.out.println(count);
			
		}
	}
	
	static void walkTiles(int y,int x,char[][] tiles){
		if(y>tiles.length-1 || x<0 || y<0 || x>tiles[y].length-1) return;
		if(tiles[y][x] == '#') return;
		
		count++;
		tiles[y][x] = '#';
		
		// テ・ツ?催・ツクツーテゥツδィテ・ツ按?
		walkTiles(y-1,x,tiles);
		walkTiles(y,x+1,tiles); 
		walkTiles(y+1,x,tiles);
		walkTiles(y,x-1,tiles);
	}

}