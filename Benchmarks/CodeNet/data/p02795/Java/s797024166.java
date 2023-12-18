import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
        int b = sc.nextInt();
		int c = sc.nextInt();
        int d = 0;
        if(a>b){d=c/a;if(c%a!=0){d++;}}else{d=c/b+1;if(c%b!=0){d++;}}
		System.out.println(d);
	}
}
