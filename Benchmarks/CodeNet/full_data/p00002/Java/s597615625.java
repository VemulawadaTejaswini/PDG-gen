import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] x){
		byte[] k = new byte[200];
		try{
			Scanner sc = new Scanner(System.in);
			for(byte i=-127;i<73;i++){
				String s = sc.nextLine();
				if(s==null||s.equals("")){
					k[i+127]=0;
					break;
				}
				k[i+127] = dig(Integer.parseInt((s.split(" ",0))[0])+Integer.parseInt((s.split(" ",0))[1]));
			}
		}catch(Exception e){}
		for(byte i=-127;i<73;i++){
			if(k[i+127]>0){System.out.println(k[i+127]);}
			else{break;}
		}
    }
	public static byte dig(int a){
		byte d = 0;
		while(true){
			if(a>=10){
				d++;
				a/=10;
			}
			else{return (byte)((int)d+1);}
		}
	}
}