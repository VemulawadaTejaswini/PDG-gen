import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int[] iline = new int[4];
		int isum = 0;
		char op1 = '-';
		char op2 = '-';
		char op3 = '-';
		
		for(int i=0;i<4;i++){
			iline[i] = line.charAt(i);
			iline[i] -= 48;
		}
		for(int j=0;j<2;j++){
			op1 = hantenchar(op1);
			for(int k=0;k<2;k++){
				op2 = hantenchar(op2);
				for(int l=0;l<2;l++){
					op3 = hantenchar(op3);
					isum = iline[0];
					if(op1 == '+'){
						isum += iline[1];
					}
					else{
						isum -= iline[1];
					}
					if(op2 == '+'){
						isum += iline[2];
					}
					else{
						isum -= iline[2];
					}
					if(op3 == '+'){
						isum += iline[3];
					}
					else{
						isum -= iline[3];
					}
					if(isum==7){
						j=2;
						k=2;
						l=2;
					}
				}
			}
		}
		System.out.println(iline[0]+""+op1+""+iline[1]+""+op2+""+iline[2]+""+op3+""+iline[3]+"=7");
    }
    public static char hantenchar(char x){
    	if(x == '+'){
    		x = '-';
    	}
    	else{
    		x = '+';
    	}
    	return x;
    }
}
