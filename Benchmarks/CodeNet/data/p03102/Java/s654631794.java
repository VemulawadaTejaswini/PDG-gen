import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N =	Integer.parseInt(sc.next());
	int M =	Integer.parseInt(sc.next());
	int C =	Integer.parseInt(sc.next());
	int[] b	= new int[N];
	for(int i = 0; i<N; i++) {
            b[i] = Integer.parseInt(sc.next());
	}
	int cnt	= 0;
        for(int i = 0; i<M; i++) {
            int	tmp = 0;
	    for(int j = 0; j<N; j++) {
		tmp += sc.nextInt() * b[i]
            }
            tmp	+= c;
            if(tmp>0) cnt++;
        }
	System.out.println(cnt);
    }
}