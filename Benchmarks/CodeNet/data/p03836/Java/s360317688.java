import java.util.*;
public class Main {
  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
      	int ty = sc.nextInt();
      
      	// 答えをここに入れていくよ
      	List<String> ansList = new ArrayList<>(); 

      	// xの変化量
      	int xd = tx - sx;
      	// yの変化量
      	int yd = ty - sy;
      
      	// 1往復目＿行き
      	// xd回右へ
      	ansList.addAll(createFilledList(xd, "R"));
      	// yd回上へ
      	ansList.addAll(createFilledList(yd, "U"));
      
      	// 1往復目＿帰り
      	// xd回左へ
      	ansList.addAll(createFilledList(xd, "L"));
      	// yd回下へ
      	ansList.addAll(createFilledList(yd, "D"));
      
      	// 2往復目＿行き
      	// 1回迂回して下へ
      	ansList.add("D");
      	// xd+1回右へ
      	ansList.addAll(createFilledList(xd + 1, "R"));
      	// yd+1回上へ
      	ansList.addAll(createFilledList(yd + 1, "U"));
      
      	// 2往復目＿帰り
      	// 1回迂回して上へ
      	ansList.add("U");
      	// xd+1回左へ
      	ansList.addAll(createFilledList(xd + 1, "L"));
      	// yd+1回下へ
      	ansList.addAll(createFilledList(yd + 1, "D"));
      
      	// Listを文字列連結する
      	String ans = String.join("", ansList);
      
      	// 答え
		System.out.println(ans);
		sc.close();
	}
    private static List<String> createFilledList(int length, String c) {
    	String[] temp = new String[length];
      	Arrays.fill(temp, c);
      	return Arrays.asList(temp);
    }
}