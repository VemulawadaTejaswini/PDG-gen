import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int array[] = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		int x = 0;
		
		for(int s:array){
			if(s==1){
				x = x + 1;
			}
		}
		System.out.println(x);
	}
}
		