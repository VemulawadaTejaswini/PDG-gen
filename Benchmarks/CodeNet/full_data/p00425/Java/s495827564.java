//Volume5-0502
import java.util.*;

class Main {
	
	private static int[][][] t = {{{1,2,3},{2,3,4}},
		                          {{2,2,0},{5,4,2}},
		                          {{0,0,3},{1,3,5}}};
	
	private static int[] dice;
	private static int   sum;
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		while((n=sc.nextInt())!=0){
			init();
			while(n-- > 0){
				s=sc.next();
				if     (s.equals("North")){change(0,0);}
				if     (s.equals("South")){change(0,1);}
				else if(s.equals("East")) {change(1,0);}
				else if(s.equals("West")) {change(1,1);}
				else if(s.equals("Right")){change(2,0);}
				else if(s.equals("Left")) {change(2,1);}
				sum+=dice[2];
			}
			System.out.println(sum);
		}
	}

	private static void init(){
		sum  = 1;
		dice = new int[6];
		int[] init = {4,5,1,2,6,3}; 
		for(int i=0;i<6;i++){
			dice[i] = init[i];
		}
	}

	private static void change(int a,int b){
		int init,limit,incr;
		if   (b==0){init=0; limit=3 ; incr= 1;}
		else       {init=2; limit=-1; incr=-1;}
		for(int i=init;i!=limit;i+=incr){
			swap(t[a][0][i],t[a][1][i]);
		}
	}
	
	private static void swap(int i,int j){
		dice[j]  = dice[i] - dice[j];
		dice[i] -= dice[j];
		dice[j] += dice[i];
	}
}