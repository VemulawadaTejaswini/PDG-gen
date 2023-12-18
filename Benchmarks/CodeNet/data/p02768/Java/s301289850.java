import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	int A = sc.nextInt();
	int B = sc.nextInt();

	int count=0;
	count = (int)Math.pow(2,N) - 1;

	double bunshi = 1;
	double bunbo = 1;
	for(int k=N;k>=(N-A+1);k--) {bunshi =(bunshi*k)%(Math.pow(10,9)+7);}
	for(int k=A;k>=1;k--) {bunbo = (bunbo*k)%(Math.pow(10,9)+7);}
	
	count -= bunshi/bunbo;

	double bunshi2 = 1;
	double bunbo2 = 1;
	for(int k=N;k>=(N-B+1);k--) {bunshi2 =(bunshi2*k)%(Math.pow(10,9)+7);}
	for(int k=B;k>=1;k--) {bunbo2 = (bunbo2*k)%(Math.pow(10,9)+7);}
	
	count -= bunshi2/bunbo2;

	System.out.print(count);


    }
}
