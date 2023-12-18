import java.util.Scanner;

public class Main{


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int[] arr = new int[str.length()];
		int a=0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='B'){
				arr[i]=1;
			}
		}
		for(int j=0; j<str.length(); j++){
			for(int i=0; i<str.length()-1; i++){
				if(arr[i]==1&&arr[i+1]==0){
					arr[i]=0;arr[i+1]=1;
					a++;
				}
			}
		}		
		System.out.println(a);
	}

}