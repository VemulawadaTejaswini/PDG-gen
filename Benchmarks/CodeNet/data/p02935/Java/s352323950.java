import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double [] in = new double [a];
        
        for(int i=0;i<a;i++){
                             in[i] = sc.nextDouble();
                            }
		Arrays.sort(in);
        double ans = in[0];
        for(int i=1;i<a;i++){ans = (ans+in[i])/2;}
		System.out.println(ans);
	}
}
