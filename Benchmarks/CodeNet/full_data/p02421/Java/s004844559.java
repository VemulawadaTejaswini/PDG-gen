import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		int taroPoint = 0;
		int hanakoPoint= 0;
		String str =null;
		ArrayList<String> taro = new ArrayList<String>();
		ArrayList<String> hanako = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int j = 0; j < n; ++j){
			for(int i = 0; i < 2; ++i){
				str = sc.next();
				if(i == 0)
				taro.add(str);
				else if(i == 1)
					hanako.add(str);
			}
		}
		for(int a = 0; a < n; ++a){
			int comp = (taro.get(a)).compareTo(hanako.get(a));
			if(comp < 0){
				hanakoPoint += 3;
			}
			else if(comp > 0){
				taroPoint += 3;
			}
			else{
				hanakoPoint += 1;
				taroPoint += 1;
			}
			}
		System.out.println(taroPoint+" "+hanakoPoint);
		sc.close();
	}

}