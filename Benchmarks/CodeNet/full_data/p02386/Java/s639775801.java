import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		int n =Integer.parseInt(sc.nextLine());
		Dice[] dice = new Dice[n];
		boolean flag=true;
		
		for(int i=0;i<n;i++){
			String[] line = sc.nextLine().split(" ");
			for(int j=0;j<6;j++){
				num[j]=Integer.parseInt(line[j]);
			}
			dice[i]=new Dice(num);
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){			
				int[][] numSet=new int[3][2];
				numSet[0][0]=dice[i].lavel1;
				numSet[0][1]=dice[i].lavel6;
				numSet[1][0]=dice[i].lavel2;
				numSet[1][1]=dice[i].lavel5;
				numSet[2][0]=dice[i].lavel3;
				numSet[2][1]=dice[i].lavel4;
			
				int[][] exNumSet=new int[3][2];
				exNumSet[0][0]=dice[j].lavel1;
				exNumSet[0][1]=dice[j].lavel6;			
				exNumSet[1][0]=dice[j].lavel2;
				exNumSet[1][1]=dice[j].lavel5;
				exNumSet[2][0]=dice[j].lavel3;
				exNumSet[2][1]=dice[j].lavel4;
				
				int[] set=new int[3];
				for(int k=0;k<3;k++){
					for(int m=0;m<3;m++){
						if(exNumSet[k][0]==numSet[m][0]){
							if(exNumSet[k][1]==numSet[m][1]){
								set[m]=k+1;
								numSet[m][1]=-1;
								break;
							}
						}else if(exNumSet[k][0]==numSet[m][1]){
							if(exNumSet[k][1]==numSet[m][0]){
								set[m]=-1*(k+1);
								numSet[m][1]=-1;
								break;
							}
						}
					}
				}
				if(numSet[0][1]==-1 && numSet[1][1]==-1 && numSet[2][1]==-1){
					int[] m =new int[3];
					for(int l=0;l<3;l++){
						if(set[0]>0){
							m[l]=exNumSet[set[l]-1];
						}else{
							m[l]=exNumSet[set[l]*(-1)-1];
						}
					}
					if(int l=0;l<3;l++){
						if(m[0]==numSet[0][0] && m[1]==numSet[1][0] && m[2]==numSet[2][0]){
							flag=false;
							break;
						}
					}
				}
			}
			if(!(flag)){
				break;
			}
		}
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
		
		
		
class Dice{
//
	final int lavel1,lavel2,lavel3,lavel4,lavel5,lavel6;
	private int w,s,e,n;
	private int upper,lower;
//	
	Dice(int[] i){
		lavel1=i[0];
		lavel2=i[1];
		lavel3=i[2];
		lavel4=i[3];
		lavel5=i[4];
		lavel6=i[5];
		
		w=lavel4;
		s=lavel2;
		e=lavel3;
		n=lavel5;
		
		upper=lavel1;
		lower=lavel6;
	}
	
	public int getUpper(){
		return upper;
	}
	public int getW(){
		return w;
	}
	public int getS(){
		return s;
	}
	public int getE(){
		return e;
	}
	public int getN(){
		return n;
	}
	public int getLower(){
		return lower;
	}
	
	public void moveW(){
		int i=lower;
		lower=w;
		w=upper;
		upper=e;
		e=i;
	}
	public void moveS(){
		int i=lower;
		lower=s;
		s=upper;
		upper=n;
		n=i;
	}
	public void moveE(){
		int i=lower;
		lower=e;
		e=upper;
		upper=w;
		w=i;
	}
	public void moveN(){
		int i=lower;
		lower=n;
		n=upper;
		upper=s;
		s=i;
	}
}
