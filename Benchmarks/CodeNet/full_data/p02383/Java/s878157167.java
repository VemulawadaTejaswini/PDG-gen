import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Dice dice=new Dice();
		dice.set();
		dice.roll();
		System.out.println(dice.get(1));
	}

}
class Dice {
	public static Scanner sc;
	int d[]=new int[6];
	void set(){
		sc=new Scanner(System.in);
		for(int i=0;i<6;i++){
			d[i]=sc.nextInt();
		}
	}
	void roll(){
		sc=new Scanner(System.in);
		String ord=sc.next();
		for(int i=0;i<ord.length();i++){
			int temp=d[0];
			switch(ord.charAt(i)) {
			case 'N':
				d[0]=d[1];
				d[1]=d[5];
				d[5]=d[4];
				d[4]=temp;
				break;
			case 'S':
				d[0]=d[4];
				d[4]=d[5];
				d[5]=d[1];
				d[1]=temp;
				break;
			case 'E':
				d[0]=d[3];
				d[3]=d[5];
				d[5]=d[2];
				d[2]=temp;
				break;
			case 'W':
				d[0]=d[2];
				d[2]=d[5];
				d[5]=d[3];
				d[3]=temp;
				break;
			}
		}
	}
	int get(int i){
		return d[i-1];
	}
}