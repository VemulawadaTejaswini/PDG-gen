import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	long a = 1;
	int n = sc.nextInt();
	for(int i=0;i<n;i++){
	    long m = sc.nextLong();
	    a*=m;
	}
	if(Math.log10(a)>18){
	    System.out.println("-1");
	}else{
	    System.out.println(a);
	}
      }
}
