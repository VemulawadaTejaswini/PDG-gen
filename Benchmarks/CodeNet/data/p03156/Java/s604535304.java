import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner Cf=new Scanner(System.in);
		short n=Cf.nextShort();
		short A=Cf.nextShort();
		short B=Cf.nextShort();
	
		short[] arrayx=new short[n];
		for(short i=0;i<n;i++) {
			arrayx[i]=Cf.nextShort();
			
		}
		
		//solve
		solve(A,B,arrayx);
		
	}
	
	
	public static void solve(short A,short B,short[] array){
		int x=0,y=0,z=0;
		for(short a=0;a<array.length;a++) {
			if(array[a]<=A) {
				x++;
			}
			else if(A<array[a] && array[a]<=B) {
				y++;
			}
			else if(array[a]>B) {
				z++;
			}
		}
		short[] xarr=new short[x];
		short[] yarr=new short[y];
		short[] zarr=new short[z];
		
		int answer=0;
		
		if(x <= y && x <= z) {
			answer=x;
		}
		else if( y<=x && y<=z) {
			answer=y;
		}
		else if( z<=x && z<=y) {
			answer=z;
		}
		System.out.println(answer);
		
		
	}
	


}
