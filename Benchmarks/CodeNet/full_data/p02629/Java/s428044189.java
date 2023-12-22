import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	int digit = (int)(Math.log((double)n)/Math.log(26));
	for(int i=digit;i>=0;i--){
	    int j;
	    for(j=1;j<=26;j++){
		if(Math.pow(26,i)*j>n){
		    j--;
		    break;
		}
	    }
	    if(j>=1){
		char c = (char)('a'-1+j);
		System.out.print(c);
	    }else{
          System.out.println("z");
		i--;
	    }
	    n%=(long)Math.pow(26,i);
	}
	sc.close();
      }
}
