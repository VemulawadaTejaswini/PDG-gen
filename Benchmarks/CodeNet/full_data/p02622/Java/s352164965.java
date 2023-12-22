import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] a = sc.next().split("",0);
		String[] b = sc.next().split("",0);
		int count = 0;
		for(int i = 0; i < a.length; i++){
			if(!a[i].equals(b[i])){
				count++;
			}
		}
		System.out.print(count);
	}
}