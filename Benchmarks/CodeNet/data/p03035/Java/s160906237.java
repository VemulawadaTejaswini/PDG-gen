import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();

	int ans = 0;
	if(a <= 5){
	    ans = 0;
	}else if(a <= 12){
	    ans = b/2;
	}else{
	    ans = b;
	}

	System.out.println(ans);
    }
}

