package atcorder;

import java.util.Scanner;

public class atcorder1 {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println("a+b=15 であれば + を、 a×b=15 であれば * を、 どちらでもなければ x を出力してください。");

    String input = scanner.nextLine();

    int answer1;
    int answer2;

    if (input == "+") {
    	answer1 = a + b ;
    	System.out.println("a + b = answerです。");
	}
    if(input == "*"){
    	answer2 = a * b ;
    	System.out.println("a * b = answerです。");
    }
    if(input == "x"){
    	answer1 = a + b ;
    	answer2 = a + b ;
    	System.out.println("a + b = answerであり、a * b = answer1であるため、どちらも15ではありません。");
    }
	}
}