import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int W = sc.nextInt();
	String subete[] = new String[H];

	for(int n = 0;n < H;n++){
		subete[n] = sc.next();	
	}
	for(int i = 0;i < W+2;i++){
		System.out.print("#");
	}
	System.out.println("");
	for(int i = 0;i < H;i++){
		System.out.println("#" + subete[i] + "#");	
	}
	for(int i = 0;i < W+2;i++){
		System.out.print("#");
	}
	System.out.println("");	
	}
}
	

