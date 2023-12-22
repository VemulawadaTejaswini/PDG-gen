import java.util.*;

class Main{
    Scanner sc = new Scanner(System.in);

    Main(){
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println( (a*b) + " " + (a*2+b*2) );
    }

    public static void main(String[] args){
	new Main();
    }
}
