import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] point = new int[6];
		Boolean Same = true;
		Scanner scan = new Scanner(System.in);
		int max = 0;
		for(int i = 0; i<6; i++){
			point[i]=scan.nextInt();
			if(point[i]>max){
				max=point[i];
			}
		}
		Dice3 dice = new Dice3(point);
		for(int i = 0; i<6; i++){
			point[i]=scan.nextInt();
		}
		Dice3 dice_o = new Dice3(point);
		scan.close();
		
		dice_o.MoveToBottom(max);
		dice.MoveToBottom(max);
		
		if(dice_o.T!=dice.T){
			Same=false;
		}
		
		if(Same){
			for(int i=0;i<4;i++){
				if(dice_o.F==dice.F&&dice_o.B==dice.B&&dice_o.L==dice.L&&dice_o.R==dice.R){
					Same=true;
					break;
				}
				else
					Same=false;
					dice.Move('R');
			}
		}
		
		if(Same)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
class Dice3{
	int T,F,R,L,B,D;

	public Dice3(int[] point){
		this.T=point[0];
		this.F=point[1];
		this.R=point[2];
		this.L=point[3];
		this.B=point[4];
		this.D=point[5];
	}
	
	public void MoveToBottom(int point){
		while(true){
			if(this.D==point){
				break;
			}
			else if(this.T==point){
				this.Move('S');
				this.Move('S');
				break;
			}
			else if(this.F==point){
				this.Move('S');
				break;
			}
			else{
				this.Move('R');
			}
		}
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
			case 'R':
				temp=this.F;
				this.F=this.R;
				this.R=this.B;
				this.B=this.L;
				this.L=temp;
		}
	}
}
