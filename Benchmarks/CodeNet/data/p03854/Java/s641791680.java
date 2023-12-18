import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		run();
	}
	static void run(){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String dreameraser = "";
		String dreamerasera[] = new String[10000];
		dreamerasera = s.split("dreameraser");
		for(int i = 0; i < dreamerasera.length; i++){
			dreameraser += dreamerasera[i];
		}
		String dreamerase = "";
		String dreamerasea[] = new String[10000];
		dreamerasea = dreameraser.split("dreamerase");
		for(int i = 0; i < dreamerasea.length; i++){
			dreamerase += dreamerasea[i];
		}
		String dreamer = "";
		String dreamera[] = new String[10000];
		dreamera = dreamerase.split("dreamer");
		for(int i = 0; i < dreamera.length; i++){
			dreamer += dreamera[i];
		}
		String eraser = "";
		String erasera[] = new String[10000];
		erasera = dreamer.split("eraser");
		for(int i = 0; i < erasera.length; i++){
			 eraser += erasera[i];
		}
		String dream = "";
		String dreama[] = new String[10000];
		dreama = eraser.split("dream");
		for(int i = 0; i < dreama.length; i++){
			 dream += dreama[i];
		}
		String erase = "";
		String erasea[] = new String[(int)Math.pow(10, 5)];
		erasea = dream.split("erase");
		for(int i = 0; i < erasea.length; i++){
			 erase += erasea[i];
		}
		erase += "*";
		if(erase.equals("*")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}
