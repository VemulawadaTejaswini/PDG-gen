import java.util.Scanner;

class Dice{
	int front,back,top,bottom,right,left;

	public Dice(int[] n){
		front=n[1];
		back=n[4];
		top=n[0];
		bottom=n[5];
		right=n[2];
		left=n[3];
	}

	public void Turnx(){
		int swap;
		swap=top;
		top=front;
		front=bottom;
		bottom=back;
		back=swap;
	}

	public void Turny(){
		int swap;
		swap=front;
		front=left;
		left=back;
		back=right;
		right=swap;
	}

	public void Turnz(){
		int swap;
		swap=top;
		top=right;
		right=bottom;
		bottom=left;
		left=swap;
	}

	public int Check(Dice a){
		int c=0;
		if(this.top==a.top){
			c++;
		}
		if(this.bottom==a.bottom){
			c++;
		}
		if(this.front==a.front){
			c++;
		}
		if(this.back==a.back){
			c++;
		}
		if(this.right==a.right){
			c++;
		}
		if(this.left==a.left){
			c++;
		}

		if(c==6){
			return 1;
		}else{
			return 0;
		}
	}

	public void Show(){
		System.out.printf("%d %d %d %d %d %d\n",top,front,right,left,back,bottom);
	}

}

public class Main{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l,f=0;
		int[] num=new int[6];

		n=scan.nextInt();
		Dice[] dice=new Dice[n];

		for(i=0;i<n;i++){
			for(j=0;j<6;j++){
				num[j]=scan.nextInt();
			}
			dice[i]=new Dice(num);
		}

		for(i=0;i<n-1;i++){
			for(j=i+1;j<n;j++){
				for(k=0;k<6;k++){
					if(dice[i].top==dice[j].top&&dice[i].bottom==dice[j].bottom){
						for(l=0;l<4;l++){
							f=dice[i].Check(dice[j]);
							if(f==1){
								break;
							}
							dice[j].Turny();
						}
					}
					if(k%2==0){
						dice[j].Turnx();
					}else{
						dice[j].Turnz();
					}
				}

				if(f==1){
					break;
				}
			}
			if(f==1){
				break;
			}
		}

		if(f==1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

		scan.close();
	}
}
