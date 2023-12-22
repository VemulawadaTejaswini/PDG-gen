import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int num[] = new int[6];
		for(int i=0;i<6;i++){
			num[i]=Integer.parseInt(line[i]);
		}
		int q = Integer.parseInt(sc.nextLine());
		Dice dice = new Dice(num);
		
		for(int i=0;i<q;i++){
			line= sc.nextLine.split(" ");
			int upper = Integer.parseInt(line[0]);
			int s = Integer.parseInt(line[1]);
			
			if(dice.getLower()==s){
				dice.moveN();
			}else if(dice.getN()==s){
				dice.moveN();
				dice.moveN();
			}else if(dice.getE()==s){
				dice.moveE();
				dice.moveN();
			}else if(dice.getW()==s){
				dice.moveW();
				dice.moveN();
			}else if(dice.getUpper()==s){
				dice.moveS();
			}
			
			if(dice.getLower()==upper){
				dice.moveW();
				dice.moveW();
			}else if(dice.getW()==upper){
				dice.moveE();
			}else if(dice.getE()==upper){
				dice.moveW();
			}
			
			System.out.println(dice.getE());
		}
	}
}
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