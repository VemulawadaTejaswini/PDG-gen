import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		java.util.Scanner sc = new Scanner(System.in); 
		while(true){
			int n = sc.nextInt();
			int sum = 0;
			int avg = 0;
			int count = 0;
				if(n == 0){
					break;
				}
				int box[] = new int[n];
				for(int i=0;i<n;i++){
					int a = sc.nextInt();
					box[i] = a;
					sum += box[i];
				}
				avg = sum/n;
				for(int i = 0;i<n;i++){
					if(box[i] <= avg){
						count++;
					}
				}
				System.out.println(count);
		}
		sc.close();
	}

}
