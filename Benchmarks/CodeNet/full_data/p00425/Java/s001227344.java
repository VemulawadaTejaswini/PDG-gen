//Volume5-0502
import java.util.*;

class Main {
	
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
				if     (s.equals("North")){north() ;}
				if     (s.equals("South")){south() ;}
				else if(s.equals("East")) {east()  ;}
				else if(s.equals("West")) {west()  ;}
				else if(s.equals("Right")){right() ;}
				else if(s.equals("Left")) {left()  ;}
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

	private static void north(){
		for(int i=1;i<4;i++){
			swap(i,i+1);
		}
	}
	private static void south(){
		for(int i=3;i>0;i--){
			swap(i,i+1);
		}
	}

	private static void east(){
		swap(2,5);swap(2,4);swap(0,2);
	}

	private static void west(){
		swap(0,2);swap(2,4);swap(2,5);
	}

	private static void right(){
		swap(0,1);swap(0,3);swap(3,5);
	}
	
	private static void left(){
		swap(3,5);swap(0,3);swap(0,1);
	}
	
	private static void swap(int i,int j){
		dice[j]  = dice[i] - dice[j];
		dice[i] -= dice[j];
		dice[j] += dice[i];
	}
}