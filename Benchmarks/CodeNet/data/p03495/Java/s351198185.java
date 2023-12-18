import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int n=scanner.nextInt();
		int k=scanner.nextInt();
		Map<Integer,Integer> data= new TreeMap<Integer,Integer>();

		for(int i=0;i<n;i++) {

			int buf=scanner.nextInt();

			if(data.containsKey(buf)) {
				data.put(buf,data.get(buf)+1);
			}else {
				data.put(buf,1);
			}
		}

		int ret=data.size()>k?data.size()-k:0;

		data.entrySet().stream()
        .sorted(java.util.Map.Entry.comparingByValue());


		int result=0;
		for(Integer key:data.keySet()) {

			if(ret==0) {
				break;
			}


			result+=data.get(key);
			ret--;



		}

		System.out.println(result);


		scanner.close();

	}
}