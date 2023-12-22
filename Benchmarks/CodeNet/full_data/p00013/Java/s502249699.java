import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class main {
	public static void main(String[] args){

		//?????°??£?¨?
		List<String> Shin = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
/*
		while (sc.hasNext()){
			int kari = sc.nextInt();
			if(kari == 0){
				hyouzi = Shin.get(Shin.size()-1);
				System.out.println(hyouzi);
				Shin.remove(Shin.size()-1);		//??°????????\??£???????????±????¶????
			}else{
				Shin.add(kari);d
			}
		}
	}
}
*/


		while (sc.hasNext()){
			String kari = sc.next();

			if(kari.equals("0")){
				String hyouzi = Shin.get(Shin.size()-1);
				System.out.println(hyouzi);
				Shin.remove(Shin.size()-1);		//??°????????\??£???????????±????¶????
			}else{
				Shin.add(kari);
			}
		}
	}
}