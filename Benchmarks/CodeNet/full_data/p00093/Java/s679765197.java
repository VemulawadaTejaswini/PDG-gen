import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	int a, b;
	boolean check = false;

	a = in.nextInt();
	b = in.nextInt();

	while(a != 0 && b != 0){

	    while(a<=b){
		if(a%4 == 0){
		    if(a%100 == 0){
			if(a%400 == 0){
			    System.out.println(a);
			    check = true;
			}
		    }else{ System.out.println(a); check = true; }
		}
		a++;
	    }

	    if(check == false) System.out.println("NA");
	    System.out.println();

	    a = in.nextInt();
	    b = in.nextInt();
	    check = false;

	}
    }
}