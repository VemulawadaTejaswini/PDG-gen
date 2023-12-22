import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		int H = sc.nextInt(),W = sc.nextInt();
		int cnt=0,ccnt=0;
		String data[][] = new String[H][W];
		int ndata[][] = new int[H][W];	
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				data[i][j] = sc.next();
				if(data[i][j].equals(".")){
					if(ccnt != 1){
						ndata[i][j] = -1;
					}else{
						cnt++;
						ndata[i][j] = cnt;
					}
				}
				else if(data[i][j].equals("c")){
					 cnt = 0;
	    			 ccnt = 1;
	    			 ndata[i][j] = 0;
				}
				if((j+1) == W) ccnt = 0;
			}
		}
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				if((j+1)==W){
					System.out.println(ndata[i][j]);
				}else{
					System.out.print(ndata[i][j]+" ");
				}
			}
		}
			
	}
}