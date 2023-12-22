import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt(), y = sc.nextInt();
	int tmp;
	if(y > x){
	    tmp = x;
	    x = y;
	    y = tmp;
	}
	while((tmp = x % y)!= 0){
	    x = y;
	    y = tmp;
	}
	System.out.println(y);
    }
}
