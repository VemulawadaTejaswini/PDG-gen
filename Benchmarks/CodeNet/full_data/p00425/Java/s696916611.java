import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			Dice dice=new Dice();
			int ans=0;
			for(int i=0;i<n;i++){
				dice.roll(sc.next());
				ans+=dice.get(1);
			}
			System.out.println(ans);
		}
	}

}
class Dice {
	int d[]={1,2,3,4,5,6};

	void roll(String s){
		int temp=d[0];
		int temp2=d[1];
		switch(s) {
			case "North":
				d[0]=d[1];
				d[1]=d[5];
				d[5]=d[4];
				d[4]=temp;
				break;
			case "South":
				d[0]=d[4];
				d[4]=d[5];
				d[5]=d[1];
				d[1]=temp;
				break;
			case "East":
				d[0]=d[3];
				d[3]=d[5];
				d[5]=d[2];
				d[2]=temp;
				break;
			case "West":
				d[0]=d[2];
				d[2]=d[5];
				d[5]=d[3];
				d[3]=temp;
				break;
			case "Right":
				d[1]=d[2];
				d[2]=d[4];
				d[4]=d[3];
				d[3]=temp2;
			case "Left":
				d[1]=d[3];
				d[3]=d[4];
				d[4]=d[2];
				d[2]=temp2;
		}
	}
	int get(int i){
		return d[i-1];
	}