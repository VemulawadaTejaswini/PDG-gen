import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int k = sc.nextInt();
	if(k>0){
	    if(k<a){
		System.out.println(k);
	    }else if(k<=a+b){
		System.out.println(a);
	    }else{
		System.out.println(2*a+b-k);
	    }
	}else{
	    System.out.println(0);
	}
      }
}
