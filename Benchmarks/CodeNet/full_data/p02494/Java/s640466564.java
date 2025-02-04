import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	private Scanner sc;
	private ArrayList<Integer> height;
	private ArrayList<Integer> width;
	
	Main(){
		sc = new Scanner(System.in);
		height = new ArrayList<Integer>();
		width = new ArrayList<Integer>();
	}
	
	public static void main(String[] args) {
		PrintRectangle printRectangle = new PrintRectangle();
		printRectangle.getInput();
		printRectangle.drawAllRectangle();
	}
	
	private void getInput() {
		//"0 0"ツつェツ禿シツ療債つウツづェツづゥツづ慊づ禿シツ療債づーツ偲ウツつッツ偲ヲツづゥ
		while(sc.hasNextLine()){
			System.out.println("input found");
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(! ((h == 0) && (w == 0)) ){
				height.add(h);
				width.add(w);
			}
			else{
				break;
			}
			System.out.println("wait for next input");
		}
	}

	private void drawRectangle(int index){
		int h = height.get(index);
		int w = width.get(index);
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void drawAllRectangle(){
		//ツ債つつウツづ閉敖づ個禿シツ療債つウツづェツつスツ青板つェツ督ッツつカツづ按づァツ図ツ形ツづーツ出ツ療債つキツづゥ
		int sumRectangle = height.size();
		if(sumRectangle == width.size()){
			for(int i = 0; i < sumRectangle; i++){
				drawRectangle(i);
			}
		}
		else{
			System.out.println("ツ債つつウツづ閉敖づ個禿シツ療債つウツづェツつスツ青板つェツ暗卍づ按づィツづ慊つキ");
		}
	}
}