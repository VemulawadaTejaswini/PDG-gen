import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int a =1000;
		int i=2;
		while(a<p) {
			a=1000*i;
			i++;
		}
		System.out.println(a-p);

	}

}



