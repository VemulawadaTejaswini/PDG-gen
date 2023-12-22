import java.util.Scanner;                      
                                               
 class Main {                                  
    public static void main(String[] args) {   
     Scanner scanner = new Scanner(System.in);      
   int n=scanner.nextInt();

   for ( int i = 1; i <= n; ++i ) {
	
	   int a = i;
	
	   if ( a % 3 == 0 ) {            //３の倍数の場合出力
	 System.out.print(" " + i);
	 }
	else 
    {
		a=a*10;
		while(a>10){                //aが2桁になるまで割り続け、10で割ったあまりが3の場合出力する、
			a=a/10;
	if ( a % 10 == 3 ) {
	   System.out.print(" " +i);
	   break;
	   }
	  }
    }
	}
	System.out.println();

	scanner.close();
}
 }
    
