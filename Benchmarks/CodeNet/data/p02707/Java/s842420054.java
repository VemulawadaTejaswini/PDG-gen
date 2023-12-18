import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer a[] = new Integer[N];
        for (int i=0; i<N-1; i++) {
            a[i] = sc.nextInt();
        }
        
         Integer t[] = new Integer[N];
        
        for (int i=1; i<=N; i++) {
        	int s = 0;
        	for (int A=i-1; A<N-1; A++) {
            	if(i == a[A])
            		s += 1;
        	}
        	t[i-1] = s;
        	//System.out.println(s);
        }
        System.out.println(Arrays.toString(t));
    }
}