import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		run();
	}
	static void run(){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String dreamer = "";
		String dreamera[] = new String[(int)Math.pow(10, 5)];
		dreamera = s.split("dreamer");
		for(int i = 0; i < dreamera.length; i++){
			dreamer += dreamera[i];
		}
		String eraser = "";
		String erasera[] = new String[(int)Math.pow(10, 5)];
		erasera = dreamer.split("eraser");
		for(int i = 0; i < erasera.length; i++){
			 eraser += erasera[i];
		}
		String dream = "";
		String dreama[] = new String[(int)Math.pow(10, 5)];
		dreama = dream.split("dream");
		for(int i = 0; i < dreama.length; i++){
			 dream += dreama[i];
		}
		String erase = "";
		String erasea[] = new String[(int)Math.pow(10, 5)];
		erasea = erase.split("erase");
		for(int i = 0; i < erasea.length; i++){
			 erase += erasea[i];
		}
		if(erase.equals("")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}
