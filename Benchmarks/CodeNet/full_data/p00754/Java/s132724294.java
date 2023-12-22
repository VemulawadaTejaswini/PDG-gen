
import java.util.Scanner;

public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label:for(;;){
			String s = cin.nextLine();
			if(s.equals("."))break;
			int[] a = new int[1100];
			int idx=1;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='['){
					a[idx]=1;
					idx++;
				}
				if(s.charAt(i)==']'){
					idx--;
					if(a[idx]==1){
						a[idx]=0;
					}
					else{
						System.out.println("no");
						continue label;
					}
				}
				if(s.charAt(i)=='('){
					a[idx]=2;
					idx++;
				}
				if(s.charAt(i)==')'){
					idx--;
					if(a[idx]==2){
						a[idx]=0;
					}
					else{
						System.out.println("no");
						continue label;
					}
				}
			}
			
				System.out.println("yes");
			
		}

	}

}