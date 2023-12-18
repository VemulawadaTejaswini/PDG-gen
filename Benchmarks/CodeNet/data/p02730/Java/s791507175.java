import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	String S = stdIn.next();
	int N = S.length();
	char[] s = new char[N];
	int flag = 0;
	for(int i=0;i<N;i++){
	    s[i]=S.charAt(i);
	}
	for(int j=0;j<N;j++){
	    if(s[j]==s[N-1-j]){
		flag++;
	    }
	    if(j<N/4&&s[j]==s[(N-1)/2-1-j]){
		flag++;
	    }
	    if(j>N/2&&j<3*N/4&&s[(N+3)/2-1-j]==s[N-j-1]){
		flag++;
	    }
	}
	int ans=(N/4)*2+N;
	if(flag==ans){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}