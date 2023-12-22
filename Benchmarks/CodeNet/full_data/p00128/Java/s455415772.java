import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str;
		Abacus a;
		
		while(scan.hasNext()){
			str = scan.next();
			a = new Abacus(str);
			System.out.println();
			a.set();
			a.show();
		}
	}
}

class Abacus{
	String number;
	String[][] ban;
	
	Abacus(String str){
		number = "";
		for(int i=str.length();i<5;i++){
			number += "0";
		}
		number += str;
		ban = new String[5][8];
	}
	
	public void set(){
		int num;
		for(int i=0;i<5;i++){
			num = Integer.valueOf(number.charAt(i)+"");
			if(num>=5){
				ban[i][0] = " ";
				ban[i][1] = "*";
			}else{
				ban[i][0] = "*";
				ban[i][1] = " ";
			}
			
			num = num%5;
			
			ban[i][2] = "=";
			
			for(int j=3;j<num+3;j++){
				ban[i][j] = "*";
			}
			
			ban[i][num+3] = " ";
			
			for(int j=num+4;j<8;j++){
				ban[i][j] = "*";
			}
		}
	}
	
	public void show(){
		for(int i=0;i<8;i++){
			for(int j=0;j<5;j++){
				System.out.print(ban[j][i]);
			}
			if(i<7){
				System.out.println();
			}
		}
	}
}