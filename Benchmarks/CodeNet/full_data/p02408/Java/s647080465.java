import java.io.*;

class Main {
	public static void main(String[] args){
		try{ 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String buf = br.readLine();
			
			int n = Integer.parseInt(buf);
			int [][] a = new int [4][13];
			
			for(int i = 0;i < n;i++){
				buf = br.readLine();
				String[] line = buf.split(" ");
				String mark = line[0]; 
				int s = Integer.parseInt(line[1]);
				if(mark.equals("S")){
					a[0][s-1] = 1;
				} else if (mark.equals("H")){
					a[1][s-1] = 1;
				} else if (mark.equals("C")){
					a[2][s-1] = 1;
				} else if (mark.equals("D")){
					a[3][s-1] = 1;
				}
			}
			
			
			for(int i = 0; i< 4;i++){
				for(int j = 0;j<13;j++){
					if(a[i][j] != 1){
						if( i == 0){
							System.out.print("S");
							System.out.println(" "+(j+1));
						}
						if( i == 1){
							System.out.print("H");
							System.out.println(" "+(j+1));
						}
						if( i == 2){
							System.out.print("C");
							System.out.println(" "+(j+1));
						}
						if( i == 3){
							System.out.print("D");
							System.out.println(" "+(j+1));
						}
					}
				}
			}
		} catch(Exception e){
		}
	}
}