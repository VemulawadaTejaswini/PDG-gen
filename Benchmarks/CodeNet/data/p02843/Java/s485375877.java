import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check = 0;
		if(n>=100||n<=105){
		    check = 1;
		}if(n>=201||n<=209){
		    check = 1;
		}if(n>=303||n<=312){
		    check = 1;
		}if(n>=406||n<=414){
		    check = 1;
		}if(n>=510||n<=515){
		    check = 1;
		}if(n==615){
		    check = 1;
		}
		System.out.println(check);
    }
}