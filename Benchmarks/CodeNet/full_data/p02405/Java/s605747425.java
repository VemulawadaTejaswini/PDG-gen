import java.util.Scanner;
class Main
{
   public static void main(String[] args)
  	{
  	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    	int n=0;
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	if(H==0 && W==0)break;
   	
    	for(int i = 0; i<H-1; i++){
       	for(int j = 0; j<W-1; j++){
          	if((i+j)/2==0)System.out.print("#");
          	else System.out.print(".");
       	}
       	System.out.println();     	
    	}
    	System.out.println();
}
}
}

