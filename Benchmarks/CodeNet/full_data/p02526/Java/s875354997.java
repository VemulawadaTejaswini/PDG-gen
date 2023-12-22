import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner (new InputStreamReader(System.in));
			int n = scan.nextInt();
			int[] list = new int[n];
			for(int i =0;i < n;i++){
				list[i] = scan.nextInt();
			}
			Arrays.sort(list);
			int m = scan.nextInt();
			int[] list2 = new int[m];
			for(int i = 0 ;i < m;i++){
				list2[i] = scan.nextInt();
			}
			Arrays.sort(list2);
			int counter = 0;
			int i=0,j =0;
			while(true){
				if( i ==n || j == m)break;
				if(list[i] == list2[j]){
					counter++;
					i++;
					j++;
				}else if(list[i]< list2[j]){
					i++;
				}else if(list[i] > list2[j]){
					j++;
				}
			}
			System.out.println(counter);
		}finally{
			scan.close();
		}
	}
}