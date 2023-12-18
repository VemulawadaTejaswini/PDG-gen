import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=String.valueOf(n).split("");
		int total=0;
		for(int i=0;i<s.length;i++){
			total+=Integer.parseInt(s[i]);
		}
		if(n%total==0){
			put("Yes");
		}else{
			put("No");
		}

}
	public static void put(String n){
		System.out.println(n);
	}

}
