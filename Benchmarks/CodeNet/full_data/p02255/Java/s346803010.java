import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int i,j,k,v;
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int array[] = new int[n];

		for(i=0;i<n;i++)array[i] = Integer.parseInt(in.next());

	for(i=0;i<n;i++){
		v = array[i];
		j = i-1;
		while(j>=0 && array[j]>v){
			array[j+1] = array[j];
			j--;
		array[j+1] = v;
		}
	    for(k = 0;k<n-1;k++)System.out.print(array[k]+" ");
	    if(i<(n-1))System.out.println(array[k]);
	    else System.out.println(array[n-1]);
	}
	}

}