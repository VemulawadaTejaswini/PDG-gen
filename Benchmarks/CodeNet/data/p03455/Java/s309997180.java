import java.util.Scanner;

public class JavaLesson {

	public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int answer = a * b;
        if(answer % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
	}
}
