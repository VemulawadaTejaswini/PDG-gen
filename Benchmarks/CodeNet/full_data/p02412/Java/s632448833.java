import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int n = in.nextInt();
	int x = in.nextInt();

	int cnt=0;
	for(int i=1;i<=n;i++){
	    for(int j=i+1;j<=n;j++){
		for(int k=j+1;k<=n;k++){
		    if((i+j+k)==9)cnt++;
		}
	    }
	}
	System.out.println(cnt);
    }
}
		    

