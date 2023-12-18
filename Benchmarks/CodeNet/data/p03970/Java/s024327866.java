
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hoge = br.readLine();
		int count =0;
		if(hoge.charAt(0)!='C'){
			count++;
		}
		if(hoge.charAt(1)!='O'){
			count++;
		}
		if(hoge.charAt(2)!='D'){
			count++;
		}
		if(hoge.charAt(3)!='E'){
			count++;
		}
		if(hoge.charAt(4)!='F'){
			count++;
		}
		if(hoge.charAt(5)!='E'){
			count++;
		}
		if(hoge.charAt(6)!='S'){
			count++;
		}
		if(hoge.charAt(7)!='T'){
			count++;
		}
		if(hoge.charAt(8)!='I'){
			count++;
		}
		if(hoge.charAt(9)!='V'){
			count++;
		}
		if(hoge.charAt(10)!='A'){
			count++;
		}
		if(hoge.charAt(11)!='L'){
			count++;
		}
		if(hoge.charAt(12)!='2'){
			count++;
		}
		if(hoge.charAt(13)!='0'){
			count++;
		}
		if(hoge.charAt(14)!='1'){
			count++;
		}
		if(hoge.charAt(15)!='6'){
			count++;
		}

		System.out.println(count);

	}

}
