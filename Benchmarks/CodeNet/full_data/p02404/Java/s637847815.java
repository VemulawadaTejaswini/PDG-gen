import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	for(int i=0; ;i++){
	    int H=sc.nextInt();
	    int W=sc.nextInt();
	    if(H==0 && W==0) break;
            for(int j=0;j<W;j++){
		System.out.print("#");
	    }
                System.out.println("");
	    for(int j=1;j<H-1;j++){
		System.out.print("#");
		for(int k=1;k<W-1;k++){
		    System.out.print(".");
		}
		System.out.println("#");
	    }
	    for(int j=0;j<W;j++){
		System.out.print("#");
	    }
	    System.out.println("");
	}
    }
}

