import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String t= sc.next();
		String buff= "";
		//double n = sc.nextInt()/1000.0;
		int m = sc.nextInt();
		//int k = sc.nextInt();
		String s=sc.next();
		long count=0,flag=0;
		long count1=0,count2=0;
		int count3=0;
		int[] array = new int[3];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		Arrays.sort(array);

		for(int i=0;i<s.length();i++) {
			if((char)(s.charAt(i)+m)>'Z') {
				buff+=String.valueOf((char)(s.charAt(i) + m-26));
			}else {
				buff+=String.valueOf((char)(s.charAt(i) + m));
			}
			//System.out.println((char)s.charAt(i));
		}

		/*if(s.length()%2==0) {
			for(int i=0;i<s.length()/2;i++) {
				for(int j=s.length();j>s.length()/2;j--) {
					if(!s.substring(i,i+1).equals(s.substring(j-1,j)))count++;
				}
			}
			System.out.println(count);
		}else{
			for(int i=0;i<s.length()/2;i++) {
				for(int j=s.length();j>s.length()/2;j--) {
					if(!s.substring(i,i+1).equals(s.substring(j-1,j)))count++;
				}
			}
			System.out.println(count);
		}*/

		System.out.println(buff);
	}
}


