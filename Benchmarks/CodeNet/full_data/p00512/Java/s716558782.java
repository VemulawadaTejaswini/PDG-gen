import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String[] a = new String[n];
		int[] s = new int[n];
		for(int i=0;i<n;i++){
			a[i] = stdIn.next();
			s[i] = stdIn.nextInt();
		}
		for(int i=0;i<n;i++){
			String min = a[i];
			int idx = i;
			for(int j=i+1;j<n;j++){
				if(min.length()>a[j].length()){
					idx = j;
					min = a[j];
				}
				else if(min.length()==a[j].length()&&min.compareTo(a[j])>0){
					idx = j;
					min = a[j];
				}
			}
			String temp1 = a[i];
			a[i] = a[idx];
			a[idx] = temp1;
			int temp2 = s[i];
			s[i] = s[idx];
			s[idx] = temp2;
		}
//		for(int i=0;i<n;i++){
//			System.out.println(a[i]+"\t"+s[i]);
//		}
		for(int i=0;i<n;){
			System.out.print(a[i]+" ");
			int sum = s[i];
			int j = i+1;
			while(true){
				if(j<n&&a[i].equals(a[j])){
					sum += s[j++];
				}
				else break;
			}
			System.out.println(sum);
			i = j;
		}
	}
}