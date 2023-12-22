import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args){

		//?????°??£?¨?
		ArrayList<Integer> Shin = new ArrayList<Integer>();
		int i = 0;
		Integer hyouzi;

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()){
			Shin.add(sc.nextInt());
			if(Shin.get(i) == 0){
				hyouzi = Shin.get(i-1);
				System.out.println(hyouzi);
				Shin.remove(i);
				Shin.remove(i-1);		//??°????????\??£???????????±????¶????
				i = i - 1;
			}else{
				i = i + 1;
			}
		}
	}
}