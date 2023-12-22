import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
                Scanner scan = new Scanner(System.in);
		while(true){
		


		int H = scan.nextInt();
	    int W = scan.nextInt();
             System.out.println();
	    if(H == 0 && W == 0)break;
	    for(int i = 0;i < H ;i++){
	    	for(int j = 0;j < W; j++){
	    		sb.append("# ");
	    	}
	    	sb.append("\n\n");
	    }
	    sb.append("\n");
	   }
		System.out.print(sb);
	}
}