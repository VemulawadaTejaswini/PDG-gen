import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i++){
			int a[] = new int[10];
			for(int j = 0 ; j < 10 ; j++){
				a[j] = input.nextInt();
			}
			boolean isok = true;
			for(int j = 0 ; j < 4 ; j++){
				if(!(a[2*j] < a[2*(j+1)] && a[2*j+1] < a[2*(j+1)+1])){
					isok = false;
					break;
				}
			}
			if(isok){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		input.close();
	}
}