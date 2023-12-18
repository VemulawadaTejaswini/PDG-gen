import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		int n=stdIn.nextInt();
		int count=1;
		String []a=new String[n];
		
		for(int i=0;i<n;i++) {
			a[i]=stdIn.next();
		}
		for(int i=0;i<n;i++){
			for(int k=0;k<i;k++) {
				if(a[k].equals(a[i]))break;
				if(k==i-1)count++;
			}
		}
		System.out.println(count);
	}

}
