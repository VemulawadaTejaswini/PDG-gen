import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			calc(n);
		}
	}
	public void calc(int n){
		String firs = "";
		String secs = "";
		int firn = 0;
		int secn = 0;
		int d = 0;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++){
			String c = sc.next();
			d+=1;
			int cn = 1;

			if(map.containsKey(c)){
				cn = map.get(c)+1;
			}
			map.put(c, cn);
			
			if(cn > firn){
				if(!(firs.equals(c))){
					secs = firs;
					secn = firn;
				}
				firs = c;
				firn = cn;
			}
			else if(cn > secn){
				secs = c;
				secn = cn;
			}
			if(secn + n - d < firn){
				break;
			}
		}
		if(firn == secn){
			System.out.println("TIE");
		}
		else{
			System.out.print(firs);
			System.out.print(" ");
			System.out.println(d);
		}
		
		for(int i = d; i < n; i++){
			sc.next();
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}