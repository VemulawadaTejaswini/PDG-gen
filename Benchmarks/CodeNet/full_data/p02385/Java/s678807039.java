import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dice dice = new Dice();
		for(int i = 0 ; i < 6 ; i ++){
			dice.d[i]=scan.nextInt();
		}
		for(int i = 0 ; i < 6 ; i ++){
			dice.d2[i]=scan.nextInt();
		}
		dice.check();
	}
}
class Dice{
	public int[] d = new int[6];
	public int[] d2 = new int[6];
	private int temp=0;	
	void N(){
		temp=d[0];
		d[0]=d[1];
		d[1]=d[5];
		d[5]=d[4];
		d[4]=temp;
	}
	void S(){
		temp=d[0];
		d[0]=d[4];
		d[4]=d[5];
		d[5]=d[1];
		d[1]=temp;
	}
	void E(){
		temp=d[0];
		d[0]=d[3];
		d[3]=d[5];
		d[5]=d[2];
		d[2]=temp;
	}
	void W(){
		temp=d[0];
		d[0]=d[2];
		d[2]=d[5];
		d[5]=d[3];
		d[3]=temp;
	}
	void R(){
		temp=d[1];
		d[1]=d[2];
		d[2]=d[4];
		d[4]=d[3];
		d[3]=temp;
	}
	void check(){
		for(int i = 0 ; i < 3 ; i ++){
			if(d[0] == d2[0]){
				break;
			}
			N();
			if(d[0] == d2[0]){
				break;
			}
			W();
		}for(int i = 0 ; i < 3 ; i ++){
			if(d[1] == d2[1]){
				break;
			}
			R();
		}
		if(Arrays.equals(d,d2)){
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}