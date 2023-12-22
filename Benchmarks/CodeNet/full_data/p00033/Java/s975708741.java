import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main{
	static String strArray[];
	static ArrayDeque<Integer> bottleB = new ArrayDeque<Integer>();
	static ArrayDeque<Integer> bottleC = new ArrayDeque<Integer>();
	static boolean flag = true;
	static int nball[] = new int[10];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		for(int i=0; i<n; i++){
			bottleB.clear();
			bottleC.clear();
			str=br.readLine();
			strArray = str.split(" ");
			initialize();
			Input();
			judge();
		}
	}

	static void Input(){
		for(int i=0; i<10; i++){
			if(!bottleB.isEmpty() && !bottleC.isEmpty()){
				if(bottleB.peek() <= nball[i]){
					bottleB.push(nball[i]);
				}else if(bottleC.peek() <= nball[i]){
					bottleC.push(nball[i]);
				}else{
					flag = false;
					break;
				}
			}else if(bottleB.isEmpty()){
				bottleB.push(nball[i]);
			}else if(bottleC.isEmpty()){
				bottleC.push(nball[i]);
			}
		}
	}

	static void initialize() {
		for(int i=0; i<10; i++){
			nball[i] = Integer.parseInt(strArray[i]);
		}
	}

	static void judge(){
		if(flag){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}