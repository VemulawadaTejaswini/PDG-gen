import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char[] c = sc.next().toCharArray();
			for(int i = 0; i < c.length; i++){
				if(c[i] == '@'){
					for(int j = 0; j < c[i+1] - '0'; j++){
						System.out.print(c[i+2]);
					}
					i += 2;
				}else{
					System.out.print(c[i]);
				}
			}
			System.out.println();
		}
	}
}