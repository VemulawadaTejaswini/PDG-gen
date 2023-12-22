import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] point = new int[6];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<6;i++){
			point[i] = scan.nextInt();
		}
		Dice dice = new Dice(point);
		char[] m = scan.next().toCharArray();
		scan.close();
		
		for(int i=0;i<m.length;i++){
			dice.Move(m[i]);
		}
		System.out.println(dice.T);
	}
}

class Dice {
	int T,F,R,L,B,D;

	public Dice(int[] point){
		this.T=point[0];
		this.F=point[1];
		this.R=point[2];
		this.L=point[3];
		this.B=point[4];
		this.D=point[5];
	}
	public void Move(char move){
		int temp;
		switch(move){
			case 'E':
				temp=this.D;
				this.D=this.R;
				this.R=this.T;
				this.T=this.L;
				this.L=temp;
				break;
			case 'S':
				temp=this.D;
				this.D=this.F;
				this.F=this.T;
				this.T=this.B;
				this.B=temp;
				break;
			case 'W':
				temp=this.D;
				this.D=this.L;
				this.L=this.T;
				this.T=this.R;
				this.R=temp;
				break;
			case 'N':
				temp=this.D;
				this.D=this.B;
				this.B=this.T;
				this.T=this.F;
				this.F=temp;
				break;
		}
	}
}
