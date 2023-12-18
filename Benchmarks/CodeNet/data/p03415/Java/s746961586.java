import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int leng = 9;
		String words[] = new String[leng];
		
		for(int i=0;i<leng;i++){
			words[i] = sc.next();
		}
		
		System.out.println(words[1]+""+words[5]+""+words[9]);
	}
}