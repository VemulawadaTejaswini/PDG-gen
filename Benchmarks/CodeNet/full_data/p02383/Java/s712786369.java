import java.util.*;

public class Main{
	public static void Main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int[] num=new num[6];
		for(int i=0;i<6;i++){
			num[i]=Integer.parseInt(line[i]);
		}
		Dice dice = new Dice(num);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='W'){
				dice.moveW();
			}else if(str.charAt(i)=='S'){
				dice.moveS();
			}else if(str.charAt(i)=='E'){
				dice.moveE();
			}else if(str.charAt(i)=='N'){
				dice.moveN();
			}
		}
		System.out.println(dice.getUpper());
	}
}

public class Dice{
//
	private int lavel1,lavel2,lavel3,lavel4,lavel5,lavel6;
	private int w,s,e,n;
	private int upper,lower;
//	
	Dice(int in1,in2,in3,in4,in5,in6){
		lavel1=in1;
		lavel2=in2;
		lavel3=in3;
		lavel4=in4;
		lavel5=in5;
		lavel6=in6;
		
		w=lavel4;
		s=lavel2;
		e=lavel3;
		n=lavel5;
		
		upper=lavel1;
		lower=lavel6;
	}
	Dice(int[] i){
		lavel1=i[1];
		lavel2=i[2];
		lavel3=i[3];
		lavel4=i[4];
		lavel5=i[5];
		lavel6=i[6];
		
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