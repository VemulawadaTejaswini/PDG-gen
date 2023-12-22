import java.util.Scanner;

public  class Main{
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int n = stdIn.nextInt();
	int i = 1;
	int ans = 0;
	while(n/i <= 0){
	ans+= n%i;
	i=i*10;
}
if(ans%9==0){
System.out.println("Yes");
}
else {
System.out.println("No");
}

}
}