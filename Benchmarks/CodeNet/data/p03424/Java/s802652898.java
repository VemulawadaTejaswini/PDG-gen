import java.util.*;

class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	int n = cin.nextInt();
	boolean flag[] = new boolean[1000];
	for(int i=0;i<n;i++){
	    char ch = cin.nextChar();
	    flag[ch]=true;
	}
	int ans=0;
	for(int i=0;i<1000;i++)
	    if(flag[i])
		ans++;
	System.out.println(ans);
    }
}