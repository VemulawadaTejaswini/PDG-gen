import java.util.Scanner;

class Main{

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String str;
		int ans = 0;
		
		while(scan.hasNext()){
			str = scan.next();
			char[] ch = str.toCharArray();
			
			for(int i = 0; i < ch.length; i++){
				if(ch.length == 1){
					ans++;
					break;
				}
				if(ch[i] != ch[ch.length - i - 1]){
					break;
				}
				if(i >= ch.length / 2){
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}