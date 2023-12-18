import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        if(a==1){a=14;}
        int b = sc.nextInt();
        if(b==1){b=14;}
		String s = "Draw";
        if(a>b){s="Alice";}
        if(a<b){s="Bob";}
		System.out.println(s);
	}
}
