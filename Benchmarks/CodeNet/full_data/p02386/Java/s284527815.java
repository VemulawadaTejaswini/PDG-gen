import java.util.*;

class Main{
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
		
		
		for(int i=1;i<n;i++){
			int upper = dice[i].getUpper();
			int s = dice[i].getS();
			
			if(dice[0].getLower()==s){
				dice[0].moveN();
			}else if(dice[0].getN()==s){
				dice[0].moveN();
				dice[0].moveN();
			}else if(dice[0].getE()==s){
				dice[0].moveE();
				dice[0].moveN();
			}else if(dice[0].getW()==s){
				dice[0].moveW();
				dice[0].moveN();
			}else if(dice[0].getUpper()==s){
				dice[0].moveS();
			}
             
			if(dice[0].getLower()==upper){
				dice[0].moveW();
				dice[0].moveW();
			}else if(dice[0].getW()==upper){
				dice[0].moveE();
			}else if(dice[0].getE()==upper){
				dice[0].moveW();
			}
			
			if(dice[0].getLower()==dice[i].getLower() && dice[0].getUpper()==dice[i].getUpper()&&
				dice[0].getN()==dice[i].getN() && dice[0].getE()==dice[i].getE()&&
				dice[0].getS()==dice[i].getS() && dice[0].getW()==dice[i].getW()){
			}else{
				flag=false;
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
	private final int lavel1,lavel2,lavel3,lavel4,lavel5,lavel6;
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