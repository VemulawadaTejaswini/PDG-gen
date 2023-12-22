import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long yokin = 100L;
		for(int i=1; i<3761; i++){
			yokin = yokin+(yokin/100);
			if(yokin >= x) {
				System.out.println(i);
				break;
			}
		}
	}
}
