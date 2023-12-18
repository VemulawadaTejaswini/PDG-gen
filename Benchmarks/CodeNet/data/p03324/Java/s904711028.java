import java.util.*;
class Main{

public static void main(String[] args){

Scanner s = new Scanner(System.in);
long d = s.nextInt() , n = s.nextInt();

	if(d == 0){
		System.out.println(n);
	}
	else if(d == 1){
		System.out.println(100*n);
	}
	else
		System.out.println(1000*n);
}
}