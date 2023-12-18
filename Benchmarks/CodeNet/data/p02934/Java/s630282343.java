import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        double [] in = new double [a];
        double ans = 0;
		for(int i=0;i<a;i++){ans+=1.0/in[i];}
        ans = 1.0/ans;
		System.out.println(ans);
	}
}
