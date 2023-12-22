import java.util.*;
class Main{
	int[] B=new int[4];
	void aa(){
		Scanner sc=new Scanner(System.in);
		while(true){
			boolean YN=false;
			int A=sc.nextInt();
			B[0]=A/1000;
			B[1]=(A-B[0]*1000)/100;
			B[2]=(A-B[0]*1000-B[1]*100)/10;
			B[3]=A%10;
			if(B[0]==0&&B[1]==0&&B[2]==0&&B[3]==0)break;
			int Ans=0;
			while(true){
				if(B[0]==B[1]&&B[1]==B[2]&&B[2]==B[3]){
					YN=true;
					break;
				}
				if(A==6174)break;
				Ans++;
				A=bb(A);
			}
			if(!YN)System.out.println(Ans);
			else System.out.println("NA");
		}
	}
	int bb(int A){
		B[0]=A/1000;
		B[1]=(A-B[0]*1000)/100;
		B[2]=(A-B[0]*1000-B[1]*100)/10;
		B[3]=A%10;
		int max;
		int min;
		for(int i=0;i<3;i++){
			for(int j=i+1;j<4;j++){
				if(B[i]<B[j]){
					int y=B[i];
					B[i]=B[j];
					B[j]=y;
				}
			}
		}
		max=B[0]*1000+B[1]*100+B[2]*10+B[3];
		min=B[3]*1000+B[2]*100+B[1]*10+B[0];
		return max-min;
	}
	public static void main(String[]arg){
		new Main().aa();
	}
}