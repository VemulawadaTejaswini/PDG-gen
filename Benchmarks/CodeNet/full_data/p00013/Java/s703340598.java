import java.util.ArrayList;
import java.util.Scanner;

class main {
	public static void main(String[] args){

		//?????°??£?¨?
		ArrayList<String> Shin = new ArrayList<String>();
		String hyouzi;

		Scanner sc = new Scanner(System.in);
while (sc.hasNext()){
	String kari = sc.next();
	if(kari.equals("0")){
		hyouzi = Shin.get(Shin.size()-1);
		System.out.println(hyouzi);
		Shin.remove(Shin.size()-1);		//??°????????\??£???????????±????¶????
	}else{
		Shin.add(kari);
	}
}
}
}