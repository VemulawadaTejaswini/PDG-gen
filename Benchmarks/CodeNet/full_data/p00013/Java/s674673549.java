import java.util.ArrayList;
import java.util.Scanner;

class main {
	public static void main(String[] args){

		//?????°??£?¨?
		ArrayList<Integer> Shin = new ArrayList<Integer>();
		Integer hyouzi;

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()){
			int kari = sc.nextInt();
			if(kari == 0){
				hyouzi = Shin.get(Shin.size()-1);
				System.out.println(hyouzi);
				Shin.remove(Shin.size()-1);		//??°????????\??£???????????±????¶????
			}else{
				Shin.add(kari);
			}
		}
	}
}