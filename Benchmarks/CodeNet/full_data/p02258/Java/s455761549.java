import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int j,k;
		int maxv = -1000000000;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int array[] = new int[n];
		for(k=0;k<n;k++)array[k] = Integer.parseInt(sc.next());
		int minv = array[0];

			for(j=1;j<n;j++){
				if(array[j]-minv > maxv){
					maxv = array[j]-minv;
				}else if(minv > array[j]){
					minv = array[j];
				}
			}
			System.out.println(maxv);

	}

}