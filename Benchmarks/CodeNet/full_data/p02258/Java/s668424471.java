import java.util.Scanner;

class Main {
    public static Boolean PrimeCheck(int x){
	for(int i=2; i<=Math.sqrt(x);i++){
	    if(x%i==0){
		return false;
	    }
	}
	return true;
    }
     public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int min = sc.nextInt();
	 int profit = Integer.MIN_VALUE;
	 
	 for(int i=1;i<n;i++){
	     int x = sc.nextInt();
	     if(profit<x-min){
		 profit = x - min;
	     }
	     if(min>x){
		 min = x;
	     }
	 }
	 System.out.println(profit);
     }
    
}
