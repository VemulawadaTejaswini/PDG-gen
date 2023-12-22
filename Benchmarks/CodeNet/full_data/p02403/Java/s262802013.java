import java.io.*;
  
class Main{
	public static void main(String[] args) throws IOException{

		int x,y,i,j;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] str = br.readLine().split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);

			for(i = 0; i < x; i++){
				for(j = 0; j < y; j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
			if(x == 0 && y ==0){
				break;
			}
		}
  	}
}