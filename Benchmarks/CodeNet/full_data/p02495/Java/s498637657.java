	import java.util.Scanner;
	public class Main {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	while(true) {
	int H = sc.nextInt();
	int W= sc.nextInt();
	int j ,i;
	if (H == 0 && W == 0) {
	break;
	}
	for(i=0;i<H;i++){
		if(i%2==1){
			for(j=0;j<W;j++){
				if(j%2==1){System.out.printf("#");}
				else{System.out.printf(".");}
			}}
			else{
				for(j=0;j<W;j++){
				if(j%2==1){System.out.printf(".");}
				else{System.out.printf("#");}
			}
			}System.out.println();
		}
	}
	}
	}
	
	