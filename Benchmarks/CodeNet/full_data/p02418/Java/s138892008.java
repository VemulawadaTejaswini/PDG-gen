import java.util.Scanner;
public class Main {
	void run(){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		int sLen = s.length();
		int pLen = p.length();
		for(int i = 0;i < sLen;i++){
			boolean check = true;
			for(int j = 0;j < pLen;j++){
				int index;
				if(sLen <= i + j){
					index = (sLen - (i + j)) * -1; 
				}else{
					index = i + j;
				}
				char sC = s.charAt(index);
				char pC = p.charAt(j);
				if(sC != pC){
					check = false;
					break;
				}
			}
			if(check){
				System.out.println("Yes");
				break;
			}else if(i == sLen - 1){
				System.out.println("No");
				break;
			}
		}
	}
	public static void main(String args[]){
		new Main().run();
	}
}