import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Map<String, Integer> dic = new HashMap<>();
		int count = stdIn.nextInt();

		for(int i = 0; i < count; i++){
			int command = stdIn.nextInt();

			switch(command){
				case 0:
					dic.put(stdIn.next(), stdIn.nextInt());
					break;

				case 1:
					String key = stdIn.next();

					if(dic.get(key) != null){
						System.out.println(dic.get(key));
					}else{
						System.out.println(0);
					}

					break;

				case 2:
					dic.remove(stdIn.next());
					break;
			}


		}
		stdIn.close();
	}

}

