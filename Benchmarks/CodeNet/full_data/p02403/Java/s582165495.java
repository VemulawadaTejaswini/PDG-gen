import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		while(true){
			Scanner sc = new Scanner(System.in);
			int H = sc.nextInt();
			int W = sc.nextInt();
	        if(H==0&W==0) break;
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
		}
        
	}
}