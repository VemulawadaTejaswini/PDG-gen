import java.util.Scanner;

class Main{	
	
	static void run(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = 0;
			
			for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
			for(int c=0;c<10;c++){
			for(int d=0;d<10;d++){
				if(a+b+c+d==n) m++;
			}
			}
			}
			}
			System.out.println(m);
		}
		
	
	}
	
	public static void main (String[] args){
		run();
	}
}