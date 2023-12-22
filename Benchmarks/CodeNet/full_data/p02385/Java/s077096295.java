import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] numa = new int[6];
		for(int i=0;i<6;i++){
			numa[i]=sc.nextInt();
		}
		Dice2 da = new Dice2(numa);
		int[] numb = new int[6];
		for(int i=0;i<6;i++){
			numb[i]=sc.nextInt();
		}
		Dice2 db = new Dice2(numb);
		if(check(da,db)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	static boolean check(Dice2 d1,Dice2 d2){
		int up=0,fr=0;
		boolean yn=true;
		for(int i=0;i<6;i++){
			//System.out.println(d1.label[0]+"/"+d2.label[i]);
			if(d1.label[0]==d2.label[i]){
				up=i;
			}
		}
		for(int i=0;i<6;i++){
			//System.out.println(d1.label[1]+"/"+d2.label[i]);
			if(d1.label[1]==d2.label[i]){
				fr=i;
			}
		}
		//System.out.println("//"+up+fr);
		if(d2.rcheck(up, fr)!=d1.label[2]){
			yn=false;
		}
		return yn;
	}

}

class Dice2{
	int[] label=new int[6];
	Dice2(int[] a){
		for(int i=0;i<6;i++){
			label[i]=a[i];
		}
	}
	int rcheck(int up,int fr){
		int a=0;
		if(up==0){
			if(fr==1){
				a=2;
			}else if(fr==2){
				a=4;
			}else if(fr==3){
				a=1;
			}else if(fr==4){
				a=3;
			}
		}else if(up==1){
			if(fr==0){
				a=3;
			}else if(fr==2){
				a=0;
			}else if(fr==3){
				a=5;
			}else if(fr==5){
				a=2;
			}
		}else if(up==2){
			if(fr==0){
				a=1;
			}else if(fr==1){
				a=5;
			}else if(fr==4){
				a=0;
			}else if(fr==5){
				a=4;
			}
		}else if(up==3){
			if(fr==0){
				a=4;
			}else if(fr==1){
				a=0;
			}else if(fr==4){
				a=5;
			}else if(fr==5){
				a=1;
			}
		}else if(up==4){
			if(fr==0){
				a=2;
			}else if(fr==2){
				a=5;
			}else if(fr==3){
				a=0;
			}else if(fr==5){
				a=3;
			}
		}else if(up==5){
			if(fr==1){
				a=3;
			}else if(fr==2){
				a=1;
			}else if(fr==3){
				a=4;
			}else if(fr==4){
				a=2;
			}
		}
		return a;
	}

}