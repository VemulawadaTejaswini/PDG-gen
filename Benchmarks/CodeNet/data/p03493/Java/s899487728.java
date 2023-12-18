import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int answer =0;
		String s =  sc.nextLine();
		if(s == "1"){
			answer = answer + 1;
		}
		String t =  sc.nextLine();
		if(t == "1"){
			answer = answer + 1;
		}
		String u =  sc.nextLine();
		if(u == "1"){
			answer = answer + 1;
		}


		System.out.println(answer);
	}
}
