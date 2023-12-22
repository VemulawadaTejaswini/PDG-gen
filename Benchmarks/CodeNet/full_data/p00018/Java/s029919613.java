
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < s.length;i++){
			list.add(Integer.parseInt(s[i]));
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(int i = 0;i<list.size();i++){
			if(i ==list.size()-1){
				System.out.println(list.get(i));
			}else{
				System.out.print(list.get(i)+" ");
			}
		}
	}

}