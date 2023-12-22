import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String tmp = sc.nextLine();
			for(int i = 0; i < tmp.length(); i++){
				if(tmp.charAt(i) == '@'){
					i += 2;
					for(int j = 0; j < tmp.charAt(i+1); i++){
						System.out.print(tmp.charAt(i));
					}
				}else{
					System.out.print(tmp.charAt(i));
				}
			}
			System.out.println();
		}
	}
}