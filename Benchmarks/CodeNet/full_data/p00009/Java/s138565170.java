import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x;
	int ch=1;
	int cnt=1;
	    
	while(sc.hasNext()){
	    cnt=1;
	    int n = sc.nextInt();
	    for(x=3;x<=n;x++){
		ch=1;
		for(int i=2;i<=Math.sqrt(x);i++){
		    if(x%i==0){
			ch=0;
			break;
		}
	    }
		if(ch==1)
		    cnt++;
	    }
	    System.out.println(cnt);
	}
    }

}