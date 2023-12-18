import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();		
        Long b = sc.nextLong();	
		if(a>1 && b>1){System.out.println((a*b)/2 + (a*b)%2);}
        else{System.out.println(1);}
	}
}
