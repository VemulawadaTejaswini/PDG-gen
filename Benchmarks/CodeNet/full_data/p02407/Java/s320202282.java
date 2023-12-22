import java.util.Scanner;
public class Main {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int N[]=new int[i];
	for(int j=0;j<i;j++){
		N[j]=sc.nextInt();
	}
	for(int s=0;s<i;s++){
		System.out.print(N[i-1-s]);
		if(s<(i-1))System.out.print(" ");
	}
	System.out.print("\n");
	}
}

