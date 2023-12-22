import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int T[] = new int[w];
		for(int i=0;i<w;i++){
				T[i]=i+1;
				//System.out.println(T[i]);
			}
		int n = sc.nextInt();
			for(int i = 0;i<n;i++ ){
				int temp = 0;
				String A = sc.next();
				String[] fruit = A.split(",");
				int a = Integer.parseInt(fruit[0]);
				int b = Integer.parseInt(fruit[1]);
				temp = T[a-1];
				T[a-1]=T[b-1];
				T[b-1]=temp;
				
			}
			for(int i = 0;i<w;i++){
				System.out.println(T[i]);
			}
	}
}