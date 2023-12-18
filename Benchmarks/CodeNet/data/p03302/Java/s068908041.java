package atcorder;

import java.util.Scanner;

public class atcorder1 {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println("a+b=15 であれば + を、 a×b=15 であれば * を、 どちらでもなければ x を出力してください。");

    String input = scanner.nextLine();

    int answer;
    int answer1;

    if (input == "+") {
    	a + b = answer;
    	System.out.println("a + b = answerです。");
	}
    if(input == "*"){
    	a * b = answer;
    	System.out.println("a * b = answerです。");
    }
    if(input == "x"){
    	a + b = answer;
    	a * b = answer1;
    	System.out.println("a + b = answerであり、a * b = answer1であるため、どちらも15ではありません。");
    }
	}
}