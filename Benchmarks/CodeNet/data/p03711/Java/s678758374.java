import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        String x="s"+sc.next()+"s";
        String y="s"+sc.next()+"s";

        String k1="s1s,s3s,s5s,s7s,s8s,s10s,s12s";
        String k2="s4s,s6s,s8s,s20s";
        if(k1.contains(x) &&k1.contains(y)) System.out.println("Yes");
        else if(k2.contains(x)&&k2.contains(y)) System.out.println("Yes");
        else System.out.println("No");

	}
}
