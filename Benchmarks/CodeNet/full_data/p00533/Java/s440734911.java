
import java.util.*;
public class Main {
	int cnt = 0;
	char[] c;
	void doIt( ) {
		//?????°??£?¨?
		Scanner sc = new Scanner(System.in);
		int h,w;
		h= sc.nextInt();
		w = sc.nextInt();
		int[][] out = new int[h][]; 
		Main[] tenki = new Main[h];
		//????????±?????\???
		for(int i = 0;i < h;i++){
			tenki[i].c = sc.next().toCharArray();
		}
		//???????????\????????????????¨????
		for(int i = 0;i < h;i++){
			out[i] = tenki[i].search();
		}
		//????????????
		for(int i = 0;i < h;i++){
			for(int k = 0;k < w;k++){
				System.out.print(out[i][k]);
				if(k != w-1)System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public int[] search(){
		int[] out = new int[this.c.length];
		for(int i = 0;i < this.c.length;i++){
			if(this.c[i] == 'c'){
				out[i] = 0;
			}else if(i-1 < 0){
				out[i] = -1;
			}else if(out[i-1] == -1){
				out[i] = -1;
			}else{
				out[i] = out[i-1] + 1;
			}
		}
		return out;
	}
	
	public static void main(String [ ] args) {
		new Main( ) . doIt( );
	}
	
	}