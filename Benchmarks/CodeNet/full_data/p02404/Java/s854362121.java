public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int h, w, i, t;
		
while(true){
		h = scan.nextInt();
		w = scan.nextInt();
		
		if(h == 0 && w == 0){
				break;
			}
		if(3 <= h && h <= 300 && 3 <= w && w <= 300){
			for(i = 0; i < h ; i++){
			for(t = 0; t < w ; t++){
				if(t == 0 || t == w - 1 || i == 0 || i == h - 1){
				System.out.print("#");
				}else{
					
					System.out.print(".");
				}
			}System.out.println("");
			
			}System.out.println("");
		
		
		}
		
		}
		}
}