import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int answer =0;
		String[] s = new String[3];

		for(int i=0; i<2; i++){
			s[i] = sc.next();
			if(s[i] == "1"){
				answer++;
			}
		System.out.println(answer);
		}
	}
}
