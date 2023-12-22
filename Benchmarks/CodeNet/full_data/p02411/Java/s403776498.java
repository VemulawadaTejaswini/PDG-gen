import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m;
	int f;
	int r;
	int q=0;
	String l = null;
	int s=0;
	for(;q!=9;){
		m=sc.nextInt();
		f=sc.nextInt();
		r=sc.nextInt();
		s = m+f;
		if(m==-1){
			if(f==-1){
				if(r==-1){
					break;
				}
			}			
		}
		if(m==-1){
			l="F";
		}else
		if(f==-1){
			l="F";
		}else
		if(s>=80){
			l="A";
		}else
		if(s>=65 && s<80){
			l="B";
		}else
		if(s>=50 && s<65){
			l="C";
		}else
		if(s>=30 && s<50 | r>=50){
			l="C";
		}else
		if(s>=30 && s<50 | r<50){
			l="D";
		}else
		if(s<30){
			l="F";
		}
		
		System.out.println(l);	
	}
	

	
	}
	}