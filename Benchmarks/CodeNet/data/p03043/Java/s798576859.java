import java.util.Scanner;

static void main(){
	Scanner scan = new Scanner(System.in);
  	String str = scan.nextLine();
    String[] astr = str.split(" ",-1)
    scan.close();
  	long n = astr[0];
  	long k = astr[1];
  	double result = 0;
  	for(int i = 1; i <= 6; i++){
    	long p = 0, a = n;	
      	while(a < k){
        	a = a * 2
            p++;
        }
      	double tmp = 0.5;
      	for(long j = 1; j < p; j++){
        	tmp = tmp * 0.5 ;
        }
      	result = result + tmp
    }
  	result = result / (double)3.0;
  	System.out.print(result);
}