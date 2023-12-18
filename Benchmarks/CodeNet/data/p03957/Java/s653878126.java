import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //入力(基本)
        String line = br.readLine();




		//　　文字列が見つからなかった場合、戻り値は-1
		String str = "にわにはにわにわとりがいる";
		int i = line.indexOf("C"); // 結果：0
		int j = line.indexOf("F", i); // 結果：4
			System.out.println("i=[" + i + "], j=[" + j + "]" + line.indexOf("F") );
		boolean b = false;
		
		b = (b || (i<0));
		b = (b || (j<0));
		b = (b || (i>j));

		if (b) { 
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
    }
}


