import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n= sc.nextInt();
      	long a[]=new long[n];
      	long pro=1;
      	boolean flag=false;
      	for (int i = 0; i < n; i++) {
			a[i]=sc.nextLong();
		}
      	for (int i = 0; i < n; i++) {
      		if((Math.pow(10,18)/pro)>a[i]){
			pro=pro*a[i];
      		}else{flag=true;break;}
		}
     if(flag){ System.out.println("-1");}
     else{System.out.println(""+pro);}
}
}