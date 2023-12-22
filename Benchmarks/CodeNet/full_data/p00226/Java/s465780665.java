import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String a = scan.next();
			String b = scan.next();
			if(a.equals("0") && b.equals("0")){
				break;
			}
			int hit = 0;
			int blow = 0;
			for(int i = 0;i < a.length();i++){
				for(int j = 0;j < b.length();j++){
					if(a.charAt(i) == b.charAt(j)){
						if(i == j){
							hit += 1;
						}else{
							blow += 1;
						}
					}
				}
			}
			System.out.println(hit + " " + blow);
		}
	}
}