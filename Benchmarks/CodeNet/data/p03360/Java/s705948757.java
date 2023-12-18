import java.util.*;
 
class Main{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    int d= sc.nextInt();

    int max = a;
    int otherSum = b+c;

    if(max < b){
      max = b;
      otherSum = a+c;
    }

    if(max < c){
      max = c;
      otherSum = a+b;
    }

    int sum = (max * d) + otherSum;
    System.out.println(sum);
	}
}