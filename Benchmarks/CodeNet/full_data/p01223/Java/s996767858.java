import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int t;
    int n;
    int x;
    int prev;
    int[] ud;

    void run(){
	while(sc.hasNext()){
	    t = sc.nextInt();
	    while(t>0){
		t--;
		n = sc.nextInt();
		ud = new int[n-1];
		prev = sc.nextInt();
		for(int i=0; i<ud.length; i++){
		    x = sc.nextInt();
		    ud[i] = x-prev;
		    prev = x;
		}
		Arrays.sort(ud);
		int max = ud[ud.length-1]<0 ? 0:ud[ud.length-1];
		int min = ud[0]>0 ? 0:Math.abs(ud[0]);
		System.out.println(max+" "+min);
	    }
	}
    }
}
		    