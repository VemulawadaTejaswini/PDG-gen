import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(a>=0){
			list.add(a);
			if(a%2==0){
				a/=2;
			}else{
				a=3*a+1;
			}
			if(list.contains(a)){
				a=list.size()+1;
				break;
			}
		}
		System.out.println(a);
	}
}