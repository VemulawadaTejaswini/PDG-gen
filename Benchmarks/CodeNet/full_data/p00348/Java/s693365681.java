import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

	//	@SuppressWarnings("resource")
	//	Scanner sc = new Scanner(System.in);

	//	int num = sc.nextInt();

		List<Integer> list = new LinkedList<Integer>();

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		Integer num = Integer.parseInt(br.readLine());
		String str;
		if((str=br.readLine())!=null){
			String[] sp = str.split(" ");

			for(int i = 0; i < num; i++){

				list.add(Integer.parseInt(sp[i]));
			}
		}
		int cnt = 0;
		for(int i = 1; i < num; i++){
			int temp = list.get(i - 1);
			if(temp > list.get(i)){

				list.remove(i - 1);
				list.add(temp);

				cnt++;

				i = 0;
			}
		}
		System.out.println(cnt);
	}
}