public class Main {
	private static Scanner input;

	public static void main(String[] args){
		   input = new Scanner(System.in);
		         
		         
		         for (;;){
		          int h = input.nextInt();
		          int w = input.nextInt();
		          if ( h !=0 && w !=0){
		           for (int i=0;i<h;i++){
		            for (int j=0;j<w;j++){
		             System.out.print("#");
		            } 
		            System.out.println();
		           }
		          
		           System.out.println();
		          }
		          else break;
		         }
	}
}