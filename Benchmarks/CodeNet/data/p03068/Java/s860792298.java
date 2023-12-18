import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.nextLine();
		int c = sc.nextInt();
		String[] d = b.split("");

		String save = d[c-1];
		for (int i=0;i<a;i++){
			if(d[i].equals(save)){
				d[i] ="*";
			}
		}
		for(int i=0;i<a;i++){
			System.out.print(d[i]);
		}
		System.out.println();
	}
}