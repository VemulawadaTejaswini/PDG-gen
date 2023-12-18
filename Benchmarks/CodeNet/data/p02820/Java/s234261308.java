import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int k= scan.nextInt();
		int r= scan.nextInt();
		int s= scan.nextInt();
		int p= scan.nextInt();
		String t =scan.next();
		scan.close();
		char arr[]=new char[n];
		int score=0;
		for(int i=0;i<n;i++) {
			if(i<k) {
				if(t.charAt(i)=='r') {
					score+=p;
					arr[i]='p';
				}else if(t.charAt(i)=='s') {
					score+=r;
					arr[i]='r';
				}else {
					score+=s;
					arr[i]='s';
				}
			} else {
				if(arr[i-k]=='p') {
					if(t.charAt(i)=='s') {
						score+=r;
						arr[i]='r';
					}
					else if(t.charAt(i)=='p') {
						score+=s;
						arr[i]='s';
					}else {
						if(i+k<n&&(t.charAt(i+k)=='p'||t.charAt(i+k)=='r'))arr[i]='r';
						else arr[i]='p';
					}
				}else if(arr[i-k]=='s') {
					if(t.charAt(i)=='s') {
						score+=r;
						arr[i]='r';
					}else if(t.charAt(i)=='r') {
						score+=p;
						arr[i]='p';
					}else {
						if(i+k<n&&(t.charAt(i+k)=='r'))arr[i]='r';
						else arr[i]='p';
					}
				}else if(arr[i-k]=='r') {
					if(t.charAt(i)=='p') {
						score+=s;
						arr[i]='s';
					}
					else if(t.charAt(i)=='r') {
						score+=p;
						arr[i]='p';
					}else {
						if(i+k<n&&(t.charAt(i+k)=='p'))arr[i]='p';
						else arr[i]='s';
					}
				}
			}
		}
		System.out.println(score);
	}

}
