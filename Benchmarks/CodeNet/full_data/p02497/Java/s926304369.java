import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		new Main().grading();
	}
	public void grading() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true){
				String[] str = br.readLine().split(" ");
				int m = Integer.parseInt(str[0]);
				int f = Integer.parseInt(str[1]);
				int r = Integer.parseInt(str[2]);
				
				String judgement = judge(m,f,r);
				if(judgement==null) break;
				System.out.println(judgement);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String judge(int m, int f, int r){
		if(m==-1&&f==-1&&r==-1) return null;
		if(m==-1||f==-1) return "F";
		if((m+f)>=80){
			return "A";
		}else if((m+f)>=65){
			return "B";
		}else if((m+f)>=50){
			return "C";
		}else if((m+f)>=30){
			if(r>=50){
				return "C";
			}else{
				return "D";
			}
		}else{
			return "F";
		}
	}
}