import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []data = new int [n];
		for(int i = 0;i < n; i++){
			data[i] = sc.nextInt();
		}
		int work;
		if(n%2!=0){
			for(int i=0; i<n/2; i++){
				work = data[i];
				data[i]=data[n-1-i];
				data[n-1-i]=work;
			}
		}else{
			for(int i=0; i<n/2; i++){
				work = data[i];
				data[i]=data[n-1-i];
				data[n-1-i]=work;
			}
		}
		for(int i = 0; i<n; i++){
			if(i == n - 1){
				System.out.print(data[i]+"\n");
			}else{
				System.out.print(data[i]+" "); 
			}
		}
	}

}