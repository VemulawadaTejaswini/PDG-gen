import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int roop;
		int t,n,e,s,w,b;
		int score;
		int[] dice=new int[6];
		String act;
		while((roop=sc.nextInt())!=0){
			score=1; t=1; n=5; b=6; s=2; e=3; w=4;	//初期状態
			for(int i=0;i<roop;i++){
				act=sc.next();
				if(act.equals("North")){
					dice=move(s,t,n,b,e,w);
				}else if(act.equals("East")){
					dice=move(w,n,e,s,t,b);
				}else if(act.equals("South")){
					dice=move(n,b,s,t,e,w);
				}else if(act.equals("West")){
					dice=move(e,n,w,s,b,t);
				}else if(act.equals("Right")){
					dice=move(t,w,b,e,n,s);
				}else if(act.equals("Left")){
					dice=move(t,e,b,w,s,n);
				}
				t=dice[0]; n=dice[1]; b=dice[2]; s=dice[3]; e=dice[4]; w=dice[5];
				score+=t;
				System.out.println(t);
			}
			System.out.println(score);
		}
		sc.close();
	}
	
	static int[] move(int t,int n,int b,int s,int e,int w){
		int[] dice=new int[6];
		dice[0]=t; dice[1]=n; dice[2]=b; dice[3]=s; dice[4]=e; dice[5]=w;
		return dice;
	}
}