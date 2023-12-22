import java.util.Scanner;
class Main
{
   public static void main(String[] args)
  	{
  	Scanner sc1 = new Scanner(System.in);
    	
    	while(true){
    	int n=0;
    	int H = sc1.nextInt();
    	int W = sc1.nextInt();
    	if(H==0 && W==0)break;
   	
    	for(int i = 0; i<H; i++){
       	for(int j = 0; j<W; j++){
          	if((i+j)/2==0)System.out.print("#");
          	else System.out.print(".");
       	}
       	System.out.println();     	
    	}
    	System.out.println();
}
}
}

