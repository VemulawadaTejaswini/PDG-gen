
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		List<String> hoge = Arrays.asList(br.readLine().split(" "));
		int count=0;
		int currentIndex=1;
		for(String str: hoge){
			if(currentIndex==Integer.valueOf(hoge.get(Integer.valueOf(str)-1))){
				count++;
			}
			currentIndex++;
		}
		System.out.println(count/2);






	}

}