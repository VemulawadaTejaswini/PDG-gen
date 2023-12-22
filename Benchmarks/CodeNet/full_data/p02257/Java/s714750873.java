import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,c=0,n,tmp;
		n = sc.nextInt();
		
		for(i=0;i<n;i++){
			tmp = sc.nextInt();
			for(j=2;j<tmp;j++){
				if(tmp % j == 0) break;
			}
			if(j==tmp) c++;
		}
		System.out.println(c);
	}

}

