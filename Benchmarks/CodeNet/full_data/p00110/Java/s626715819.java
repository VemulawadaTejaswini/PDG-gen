import java.util.Scanner;
class Main{
	static Scanner sc;
	static boolean flg,h0flg;
	static int n0,n1,n2,x0,x1,x2;
	static String instr,substr0;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		while(sc.hasNext()){
			instr=new String();
			n0=0;n1=0;n2=0;
			x0=0;x1=0;x2=0;
			instr=sc.next();
			flg=false;
			h0flg=false;
			substr0=instr.substring(0,instr.indexOf("+"));
			for(int i=0;i<substr0.length();i++){
				if(substr0.substring(i,i+1).equals("X")){
					x0=x0+(int)Math.pow(10,(substr0.length()-1-i));
					if(i==0){h0flg=true;}
				}else{
					n0=n0+Integer.parseInt(substr0.substring(i,i+1))*(int)Math.pow(10,(substr0.length()-1-i));
				}
			}
			instr=instr.substring(instr.indexOf("+")+1,instr.length());
			substr0=instr.substring(0,instr.indexOf("="));
			
			for(int i=0;i<substr0.length();i++){
				if(substr0.substring(i,i+1).equals("X")){
					x1=x1+(int)Math.pow(10,(substr0.length()-1-i));
					if(i==0){h0flg=true;}
				}else{
					n1=n1+Integer.parseInt(substr0.substring(i,i+1))*(int)Math.pow(10,(substr0.length()-1-i));
				}
			}	
			substr0=instr.substring(instr.indexOf("=")+1,instr.length());
			for(int i=0;i<substr0.length();i++){
				if(substr0.substring(i,i+1).equals("X")){
					x2=x2+(int)Math.pow(10,(substr0.length()-1-i));
					if(i==0){h0flg=true;}
				}else{
					n2=n2+Integer.parseInt(substr0.substring(i,i+1))*(int)Math.pow(10,(substr0.length()-1-i));
				}
			}
			for(int i=0;i<10;i++){
				if(i*x0+n0+i*x1+n1==i*x2+n2){
					if(i>0 || (i==0 && h0flg==false)){
						System.out.println(i);
						flg=true;
					}
				}
			}
			if(flg==false){
				System.out.println("NA");
			}
		}
	}
}