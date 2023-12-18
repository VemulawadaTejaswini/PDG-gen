import java.util.Scanner;
public class Main {
public static void main(String[]args) {
	Scanner t = new Scanner (System.in);
	int num,cont = 0, cont1=0;
	num =t.nextInt();
	String v[] = new String[num];
	for(int i = 0; i<v.length;i++) {
		v[i]= t.next();
	
	if(v[i].charAt(i)=='R'){
		cont++;
	}else if(v[i].charAt(i)=='B') {
		
		cont1++;
	}
		if(cont>cont1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
}
