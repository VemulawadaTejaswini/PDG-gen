import java.util.*;
public class Main {
  	public static int verticalSide;
  	public static int holizonticalSide;
  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
      	int ty = sc.nextInt();
      
      	// 答えをここに入れていくよ
      	List<String> ansList = new ArrayList<>(); 
 
      	// 縦の辺の長さ
      	verticalSide = ty - sy;
      	// 横の辺の長さ
      	holizonticalSide = tx - sx;
      
      	// 1往復目＿行き
      	shortest(ansList, "R", "U");
      
      	// 1往復目＿帰り
      	ansList.add("R");
      	verticalMove(ansList, "D");
      	ansList.add("D");
      	ansList.add("L");
      	holizonticalMove(ansList, "L");
      	ansList.add("U");
      
      	// 2往復目＿行き
      	ansList.add("L");
      	verticalMove(ansList, "U");
      	ansList.add("U");
      	ansList.add("R");
      	holizonticalMove(ansList, "R");
      	ansList.add("D");
      
      	// 2往復目＿帰り
      	shortest(ansList, "L", "D");
      
      	// Listを文字列連結する
      	String ans = String.join("", ansList);
      
      	// 出力
		System.out.println(ans);
	}
      
    // 最短で行く場合の道のり
   	private static void shortest(List<String> ansList, String horizonticalChar, String verticalChar){
    	// 長方形の横の辺上を移動する
		holizonticalMove(ansList, horizonticalChar);
        // 長方形の縦の辺上を移動する
       	verticalMove(ansList, verticalChar);
    }
      
    // 長方形の横の辺上を移動する
    private static void holizonticalMove(List<String> ansList, String horizonticalChar){
        for(int i = 0; i < holizonticalSide ; i++){
        	ansList.add(horizonticalChar);
       	}
  	}
      
  	// 長方形の縦の辺上を移動する
   	private static void verticalMove(List<String> ansList, String verticalChar){
    	for(int i = 0; i < verticalSide ; i++){
       		ansList.add(verticalChar);
     	}
  	}
 
      	
      	
 
}