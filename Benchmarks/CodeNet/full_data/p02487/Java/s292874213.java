import java.util.Scanner;

public class Main{
    public static void main (String[] args){
	Scanner sc = new Scanner (System.in);
	int h,w,i,j;
 	while(true){
	    h = sc.nextInt();
	    w = sc.nextInt();
	    if(h==0&&w==0) break;
	    else{
		for(i=1;i<=h;i++){
		    for(j=1;j<=w;j++){
			if(i==1||j==1||i==h||j==w) System.out.printf("#");
			else System.out.printf(".");
		    }
		    System.out.printf("\n");
 		}
 	    }
 	    System.out.printf("\n");
	}
    }
}