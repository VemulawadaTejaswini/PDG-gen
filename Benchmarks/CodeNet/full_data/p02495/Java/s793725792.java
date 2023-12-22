import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int H,W,i,j;
        Scanner sc = new Scanner(System.in);

        for(;;){
            H = sc.nextInt();
            W = sc.nextInt();
            if(H == 0 && W == 0)break;
            for(j=0;j<W;j++){
                for(i=0;i<H;i++){
                    System.out.printf("#");
                    if(i == H) break;
                    for(;;){
                        System.out.printf(".");
                        i++;
                        break;
		    }   
            	}
                System.out.println("\n");
            }
System.out.println("");
	}
    }
}