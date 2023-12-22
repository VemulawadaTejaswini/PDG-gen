import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		//????????????????????????????????°??¨??????
		int len = 0;
		ArrayList<String> list1 = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		len = Integer.parseInt(br.readLine());
		list1.add(br.readLine());

		//
		for(int a = 0; a <= len; a++){
		for(int s = 1; s <= 13; s++){
			if(list1.contains("S" +" "+ s)){
			}else{
				System.out.println("S" +" "+ s);
			}
		}for(int h = 1; h <= 13; h++){
				if(list1.contains("H" +" "+ h)){
			}else{
				System.out.println("H" +" "+ h);
			}
		}for(int c = 1; c <= 13; c++){
				if(list1.contains("C" +" "+ c)){
			}else{
				System.out.println("C" +" "+ c);
		}for(int d = 1; d <= 13; d++){
				if(list1.contains("D" +" "+ d)){
			}else{
				System.out.println("D" +" "+ d);
				}
			}
		}
	}
  }
}