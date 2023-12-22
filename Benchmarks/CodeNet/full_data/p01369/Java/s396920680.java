import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		char [] list = {'y','u','i','o','p','h','n','j','k','l','m'};
		while(true){
			String str = sc.next();
			if(str.equals("#")) break;
			char first = str.charAt(0);
			boolean temp = isC(first, list);
			//System.out.println(temp);
			int count = 0;
			for(int i= 1; i < str.length(); i++){
				boolean now = isC(str.charAt(i), list);
				//System.out.println(now + " " + temp);
				if(now == temp){
					
				}
				else{
					temp = now;
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	private boolean isC(char c, char [] list){
		for(int i=0; i < list.length;i++){
			if(c == list[i]){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}