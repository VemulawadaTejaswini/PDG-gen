import java.io.*;

class Main {
	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true){
			String[] line = br.readLine().split(" ");
			int H = Integer.parseInt(line[0]);
			int W = Integer.parseInt(line[1]);
			
			if ( H == 0 && W == 0) break;
			for(int a = 1;a <= H;a++){
				for(int b = 1; b <= W;b++){
					if( a % 2 == 1){
						if(  b % 2 == 1) { 
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					} else {
						if( b % 2 == 1){
							System.out.print(".");
						} else {
							System.out.print("#");
						}
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
			}
		} catch(Exception e){
		}
	}
}
					