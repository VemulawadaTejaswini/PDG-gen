import java.util.Scanner;

public Class FeeCalculator(){
public static void main (String [] args){
Scanner in = new Scanner(System.in);
int N = in.nextInt();
int K = in.nextInt();
int X = in.nextInt();
int Y = in.nextInt();

int total = K*X + (N-K)*Y;
System.out.println(total);
}
}



