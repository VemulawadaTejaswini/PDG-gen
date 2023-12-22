import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean[] p = new boolean[50100];
	void run(){
		p[0]=p[1]=true;
		for(int i=2;i<50100;i++){
			if(p[i]) continue;
			for(int j=i*2;j<50100;j += i){
				p[j] = true;
			}
		}
		for(;sc.hasNextInt();){
			int n=sc.nextInt();
			int i,j; 
			for(i = n-1;p[i];i--);
			for(j = n+1;p[j];j++);
			System.out.println(i+" "+j);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();	
	}
}