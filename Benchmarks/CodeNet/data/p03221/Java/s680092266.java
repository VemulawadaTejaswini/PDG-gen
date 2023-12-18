import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	
	public static void main(String[] agrs){
		String ss = "000000";
		String s1 = "";
		String s2 = "";
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M=sc.nextInt();
		int[][] arr = new int[2][M];
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<M;i++){
			arr[0][i] = sc.nextInt();
			arr[1][i] = sc.nextInt();
			set.add(arr[0][i]);
		}
		int temp = 0,ii=0,count=0;
		int piLength = set.size();
		int [] array1 = new int[piLength];
				
		for(int intT1 : set){
			array1[ii] = intT1;
			ii++;
		}
		for(int i=0;i<piLength-1;i++){
			for(int j=0;j<piLength-1-i;j++){
				if(array1[j]>array1[j+1]){
					  temp=array1[j];
			          arr[j]=arr[j+1];
			          arr[j+1]=array1;
				}
			}
		}
		
		for(int i=0;i<piLength;i++){
			for(int j=0;j<M;j++){
				if(array1[i] == arr[0][j]){
					count++;
				}
			}
			for(int k=1;k<=count;k++){
				s1 = ss + array1[i];
				s2 = ss + k;
				System.out.println(s1.substring(s1.length()-6,s1.length()) + s2.substring(s2.length()-6,s2.length()));
			}
			count = 0;
		}
		
	}

}
