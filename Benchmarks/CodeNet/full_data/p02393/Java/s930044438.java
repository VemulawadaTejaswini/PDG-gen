import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner r = new Scanner(System.in);
		int a[] = new int[3];
		int l = 0;
		for(int i = 0;i < 3;i++){
			a[i] = r.nextInt();
		}
		
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				if(a[i] < a[j]){
					l = a[i];
					a[i] = a[j];
					a[j] = l;
				}
			}
			
		}
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

}