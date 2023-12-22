
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

	private static final int MIN_X = 0;
	private static final int MIN_Y = 0;
	private static final int MAX_X = 9;
	private static final int MAX_Y = 9;

	public static final int INK_SMALL = 1;
	public static final int INK_MEDIUM = 2;
	public static final int INK_BIG = 3;
	
	private static int[][] paper = new int[MAX_X + 1][MAX_Y + 1];
	
	private static ArrayList<Integer> dropX = new ArrayList<Integer>();
	private static ArrayList<Integer> dropY = new ArrayList<Integer>();
	private static ArrayList<Integer> dropSize = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			clearPaper();
			while(true){
				String str = sc.nextLine();
				String[] input = str.split(",");
				dropInk(Integer.valueOf(input[0]), Integer.valueOf(input[1]), Integer.valueOf(input[2]));
			}
		}catch(NoSuchElementException e){
			//½àµÈ¢ÅÌÉÚé
		}finally{
			sc.close();
		}
		
		//³F}XÌÆêÔZ¢}XÌZ³ðoÍ·é
		System.out.println(getNumUnColored());
		System.out.println(getHowMuchDarkest());
	}
	
	public static void clearPaper(){
		for(int x = 0; x <= MAX_X; x++){
			for(int y = 0; y < MAX_Y; y++){
				paper[x][y] = 0;
			}
		}
	}
	
	public static void dropInk(int x, int y, int ink){
		switch(ink){
		case INK_SMALL:
			dropInkSmall(x, y);
			break;
		case INK_MEDIUM:
			dropInkMedium(x, y);
			break;
		case INK_BIG:
			dropInkBig(x, y);
			break;
		}
	}
	
	private static void dropInkSmall(int x, int y){
		paper[x][y]++;
		
		if(MIN_X <= (x - 1)){
			paper[x - 1][y]++;
		}
		if((x + 1) <= MAX_X){
			paper[x + 1][y]++;
		}
		
		if(MIN_Y <= (y - 1)){
			paper[x][y - 1]++;
		}
		if((y + 1) <= MAX_Y){
			paper[x][y + 1]++;
		}
	}
	
	private static void dropInkMedium(int x, int y){
		dropInkSmall(x, y);
		
		if(MIN_X <= (x - 1) && MIN_Y <= (y - 1)){
			paper[x - 1][y - 1]++;
		}
		if((x + 1) <= MAX_X && MIN_Y <= (y - 1)){
			paper[x + 1][y - 1]++;
		}
		
		if(MIN_X <= (x - 1) && (y + 1) <= MAX_Y){
			paper[x - 1][y + 1]++;
		}
		if((x + 1) <= MAX_X && (y + 1) <= MAX_Y){
			paper[x + 1][y + 1]++;
		}
	}
	
	private static void dropInkBig(int x, int y){
		dropInkMedium(x, y);
		
		if(MIN_X <= (x - 2)){
			paper[x - 2][y]++;
		}
		if((x + 2) <= MAX_X){
			paper[x + 2][y]++;
		}
		
		if(MIN_Y <= (y - 2)){
			paper[x][y - 2]++;
		}
		if((y + 2) <= MAX_Y){
			paper[x][y + 2]++;
		}
	}
	
	public static int getNumColored(){
		int numColored = 0;
		for(int x = 0; x <= MAX_X; x++){
			for(int y = 0; y <= MAX_Y; y++){
				if(paper[x][y] != 0){
					numColored++;
				}
			}
		}
		return numColored;
	}

	public static int getHowMuchDarkest(){
		int valueDarkest = paper[0][0];
		for(int x = 0; x <= MAX_X; x++){
			for(int y = 0; y <= MAX_Y; y++){
				if(valueDarkest < paper[x][y]){
					valueDarkest = paper[x][y];
				}
			}
		}
		return valueDarkest;
	}

	public static int getNumUnColored(){
		return 100 - getNumColored();
	}
}