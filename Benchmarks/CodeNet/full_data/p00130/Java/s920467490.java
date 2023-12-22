import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		for(int i=0;i<n;i++){
			String s1 = stdIn.next().replaceAll("->", "0");
			String s2 = s1.replaceAll("<-", "1");
			char[] s3 = s2.toCharArray();
			char[] d = new char[1000];
			int idx = 500;
			int front = idx;
			for(int j=0;j<s2.length();){
				d[idx] = s3[j++];
//				System.out.println("d["+idx+"]="+d[idx]);
				if(!(j<s2.length())){
					break;
				}
				else if(s3[j++]=='0'){
					idx++;
				}
				else{
					idx--;
					front = Math.min(front, idx);
				}
			}
			for(int j=front;;j++){
				if(d[j]==0){
					break;
				}
				System.out.print(d[j]);
			}
			System.out.println();
		}
	}
}