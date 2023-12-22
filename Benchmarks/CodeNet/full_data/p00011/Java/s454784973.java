import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int w, h;
	static int[]amida;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		w = sc.nextInt(); h = sc.nextInt();
		amida = new int[w+1];
		String line;
		String[] devide = new String[2];
		for(int i = 1; i < w+1; i++)
			amida[i] = i;
		for(int i = 0; i < h; i++){
			line = sc.next();
			devide = line.split(",");
			int exIndex1 = Integer.parseInt(devide[0]);
			int exIndex2 = Integer.parseInt(devide[1]);
			int temp = amida[exIndex1];
			amida[exIndex1] = amida[exIndex2];
			amida[exIndex2] = temp;
		}
		return true;
	}
	static void solve(){
		for(int i = 1; i < w+1; i++){
			System.out.println(amida[i]);
		}
	}

}