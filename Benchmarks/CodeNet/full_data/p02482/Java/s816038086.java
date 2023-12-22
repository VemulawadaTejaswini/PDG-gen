
import java.util.Scanner;

class Main{
    public static final String GREATER = ">";
    public static final String LESS = "<";
    public static final String EQUAL = "==";
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	String mark;
	if( a < b ){
		mark = LESS;
	}else if( a > b ){
		mark = GREATER;
	}else{
		mark = EQUAL;
	}
	System.out.printf("a %s b\n",a,mark,b);
    }
}