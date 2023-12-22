import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			int f = 0;
			int s = 0;
			for(int i = 0;i < str.length()-2;i++){
				if(str.charAt(i) == 'J'){
					if(str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I'){
						f++;
						i += 1;
					}
				}else if(str.charAt(i) == 'I'){
					if(str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I'){
						s++;
						i += 1;
					}
				}
			}
			System.out.println(f + "\n" + s);
		}
	}
}