import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    boolean solve(int N, int Y) {
	for(int	i = 0; i <= N; i++) {
            int	v1 = i * 10000;
            if(v1 > Y) break;
            for(int j =	0; j <=	N; j++) {
		int v2 = v1 + j	* 5000;
		if(v2 >	Y || i + j > N) break;
		int k =	N - i -	j;
		int v3 = v2 + k	* 1000;
		
		if(v3 == Y) {
                    System.out.println(i + " " + j + " " + k);
                    return true;
                }
            }
        }
        return false;
    }
    void doIt() {
        boolean ret = solve(sc.nextInt(), sc.nextInt());
        if(!ret ) System.out.println("-1 -1 -1");
    }
    public static void main(String args[]) {
        new Main().doIt();
    }
}
