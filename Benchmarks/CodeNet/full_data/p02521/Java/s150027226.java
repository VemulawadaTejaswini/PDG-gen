import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r,c;
		while(true){
			r = s.nextInt();
			c = s.nextInt();
			if(r==0 && c==0) break;
			
			
			int[][] desk = new int[r+2][c+2];
			int human=1;
			boolean[] flag = new boolean[r+c+1];
			for(int i=1; i<r+1; i++){
				for(int j=1; j<c+1; j++){
					int count=0;

					if(i+1 > r) count++;
					if(i-1 <= 0) count++;
					if(j+1 > c) count++;
					if(j-1 <= 0) count++;					
					if(count!=4) flag[human] = true;
					human++;
					//System.out.println(count);

				}
			}
			
			boolean p_flag=true;
			for(int i=1; i<human; i++){
				if(flag[i] == false){
					//System.out.println("flag[i]:" + i);
					p_flag=false;
				}			
			}
			if(!p_flag) System.out.println("no");
			else System.out.println("yes");
			
			
			
		}
		
	}

}