import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,p,box,turn;
		int[] stone;
		
		
		while(true){
			n=sc.nextInt(); //????£??????°
			p=sc.nextInt(); //?°????????????°
			if(n==0&&p==0){break;}
			stone= new int[n];
			for(int i=0;i<n;i++){stone[i]=0;}
			box=p;
			turn=0;
			
			while(true){
				if(turn==n){turn=0;}
				if(box==0){
					box=stone[turn];
					stone[turn]=0;
				}else{
					stone[turn]++;
					box--;
				}
				if(stone[turn]==p){break;}
				turn++;
			}
			System.out.println(turn);
		}
	}
}