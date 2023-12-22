
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			abacus(sc.nextInt());
			System.out.println();
		}
	}
	static void abacus(int n){
		//System.out.println(n);
		char ch[][]=new char[5][8];
		int m[]=new int[5];
		if(n>=10000){
			m[0]=n/10000;
			n%=10000;
		}
		if(n>=1000){
			m[1]=n/1000;
			n%=1000;
		}
		if(n>=100){
			m[2]=n/100;
			n%=100;
		}
		if(n>=10){
			m[3]=n/10;
			n%=10;
		}
		m[4]=n;
		for(int i=0;i<5;i++){
			//System.out.println(m[i]);
			switch(m[i]){
			case 0:{
				ch[i]="* = ****".toCharArray();
				break;
			}
			case 1:{
				ch[i]="* =* ***".toCharArray();
				break;
			}
			case 2:{
				ch[i]="* =** **".toCharArray();
				break;
			}			
			case 3:{
				ch[i]="* =*** *".toCharArray();
				break;
			}			
			case 4:{
				ch[i]="* =**** ".toCharArray();
				break;
			}			
			case 5:{
				ch[i]=" *= ****".toCharArray();
				break;
			}			
			case 6:{
				ch[i]=" *=* ***".toCharArray();
				break;
			}			
			case 7:{
				ch[i]=" *=** **".toCharArray();
				break;
			}			
			case 8:{
				ch[i]=" *=*** *".toCharArray();
				break;
			}			
			case 9:{
				ch[i]=" *=**** ".toCharArray();
				break;
			}
			}
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<5;j++){
				System.out.print(ch[j][i]);
			}
			System.out.println();
		}
	}
}