import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] seed = new String[12];
			
			for(int i = 0; i < 12; i++){
				seed[i] = str;
				str = br.readLine();
			}
			
			//System.out.println("str "+str);
			
			World world = new World(seed);
			Explorer exp = new Explorer(world);
			
			exp.searchNewIsland();
			System.out.println(exp.discoveredIsland());
		}
	}

}

class Explorer {
	private int island = 0;
	private World world;
	
	public Explorer(World world){
		this.world = world;
	}
	
	public void searchNewIsland(){
		for(int i = 0; i < world.height; i++){
			for(int j = 0; j < world.width ; j++){
				if(world.isAvailable(j, i)){
					island++;
					walk(j, i);
				}
			}
		}
	}
	
	public int discoveredIsland(){
		return island;
	}
	
	private void walk(int x, int y){
		world.areas[y][x].visit();
		
		if(world.isAvailable(x+1, y)){
			walk(x+1, y);
		}
		if(world.isAvailable(x, y+1)){
			walk(x, y+1);
		}
		if(world.isAvailable(x-1, y)){
			walk(x-1, y);
		}
		if(world.isAvailable(x, y-1)){
			walk(x, y-1);
		}
	}
}

class World {
	Area[][] areas;
	public final int width;
	public final int height;
	
	public World(String[] seed){
		height = seed.length;
		width = seed[0].length();
		areas = new Area[height][width];
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width ; j++){
				areas[i][j] = new Area(areaType(seed[i].charAt(j)));
			}
		}
		
	}
	
	private int areaType(char c){
		if(c == '1'){
			return Area.LAND;
		}
		else if(c == '0'){
			return Area.SEA;
		}
		else {
			return -1;
		}
	}
	
	public boolean isAvailable(int x, int y){
		if(x < 0 || x >= width){
			return false;
		}
		
		if(y < 0 || y >= height){
			return false;
		}
		
		if(areas[y][x].isVisited() || areas[y][x].type() == Area.SEA){
			return false;
		}
		
		return true;
	}
}

class Area {
	private int type;
	static final int LAND = 1;
	static final int SEA = 2;
	private boolean visited = false;
	
	public Area(int type){
		this.type = type;
	}
	
	public boolean isVisited(){
		return visited;
	}
	
	public int type(){
		return type;
	}
	
	public void visit(){
		this.visited = true;
	}
}