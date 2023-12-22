import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int h1=-1,h2=-1,h3=-1;
		for(int i=0;i<10;i++){
			int h=sc.nextInt();
			if(h>h1){
				h3=h2;
				h2=h1;
				h1=h;
			}else if(h>h2){
				h3=h2;
				h2=h;
			}else if(h>h3){
				h3=h;
			}
		}
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}