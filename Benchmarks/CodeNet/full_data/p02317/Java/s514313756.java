import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int s=1,n=0;
		n=scan.nextInt();
		int List[]=new int[n];
		for(int i=0;i<n;i++){
			List[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i;0<=j;j--){
				if(j<i && List[j]<List[i]){
					if(s<List[j]){
						s=List[j];
					}
				}
			}
		}
		System.out.println(s);
	}
}