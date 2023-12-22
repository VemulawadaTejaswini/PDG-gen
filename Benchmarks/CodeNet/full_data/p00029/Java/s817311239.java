import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] str = (sc.nextLine()).split(" ");
			String m = "", w = "";
			
			int i = 0, max = 0, a;
			for(String s: str){
				a = 0;
				for(String st: str){
					if(s.equals(st)){
						a++;
					}
				}
				if(max < a){
					max = a;
					w = s;
				}
				if(s.length() > m.length()){
					m = s;
				}
				i++;
			}
			System.out.println(w+" "+m);
		}
	}

	public static void main(String[] args){
		new Main();
	}
}