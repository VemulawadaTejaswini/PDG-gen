import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a, sp = 0;
		int[] stack = new int[10];
		while(sc.hasNext()){
			a = sc.nextInt();
			if(a == 0){
				System.out.println(stack[--sp]);
			}else{
				stack[sp++] = a;
			}
		}
	}
}