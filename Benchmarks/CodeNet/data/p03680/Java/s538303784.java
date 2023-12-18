import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		Map<Integer,Integer> data=new TreeMap<Integer,Integer>();

		for(int i=1;i<=n;i++) {
			data.put(Integer.valueOf(i),Integer.valueOf(sc.nextInt()));
		}

		int counter=1;
		int firstkey=data.get(1);
		int key=0;
		int buf=0;
		while(true) {



			if(counter==1) {
				key=firstkey;
			}




			buf=data.get(key);
			counter++;
			key=buf;


			if(buf==2) {
				System.out.println(counter);
				break;
			}

			if(counter>=n) {
				System.out.println("-1");
				break;

			}

		}


		sc.close();


	}


}

