import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String S = sc.next();
	char[] s = new char[N];
	for(int i=0;i<N;i++) s[i] = S.charAt(i);
	int count = 0;
	for(int i=0;i<N-2;i++){
	    for(int j=i+1;j<N-1;j++){
		for(int k=j+1;k<N;k++){
		    if(s[i]!=s[j] && s[i]!=s[k] && s[j]!=s[k]){
			if(j-i != k-j) count++;
		    }
		}
	    }
	}
	System.out.print(count);
    }
}
