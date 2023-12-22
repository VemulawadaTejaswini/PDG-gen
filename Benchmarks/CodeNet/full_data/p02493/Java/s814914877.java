import java.util.*;
class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	int n = cin.nextInt();
	int[] a;
	a = new int[n];
	for(int i=0;i<n;i++){
	    a[i]=cin.nextInt();
	}
	for(int i=n-1;i>0;i--){
	    System.out.print(a[i]+" ");
	}
	System.out.println(a[0]);
    }
}