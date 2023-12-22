import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split(" ");
        int H = Integer.parseInt(array[0]);
        int W = Integer.parseInt(array[1]);
		while(H!=0&&W!=0){
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
			array = br.readLine().split(" ");
	        H = Integer.parseInt(array[0]);
	        W = Integer.parseInt(array[1]);
		}
	}
}