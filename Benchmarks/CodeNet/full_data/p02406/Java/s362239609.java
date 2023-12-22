import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i=0;
	int n = sc.nextInt();
	while(++i <=n){
	int x=i;
	if (x % 3 ==0){
	System.out.printf(" %d",i);
	}else if(x % 10==3){
	while(x!=0){
	x/=10;}
	System.out.printf(" %d",i);
	}
	}
	System.out.println();
}
}
	