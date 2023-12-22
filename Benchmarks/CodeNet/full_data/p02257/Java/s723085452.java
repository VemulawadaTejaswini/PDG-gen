import java.util.*;

public class Main{
    boolean p = true;
    public static void main(String[] args){
	int count = 0;
	boolean p = false;
	Scanner a = new Scanner(System.in);
	int n = a.nextInt();
	int m[] = new int[n];
	for(int i = 0; i < n; i++){
	    m[i] = a.nextInt();
	}
	for(int i=0; i<n; i++){
	    if(m[i]==2 || m[i]==3 || m[i]==5){
		p = true;
	    }
	    else if(m[i]>2 && m[i]%2==0){
		p = false;
	    }
	    else if(m[i]>3 && m[i]%2!=0){
		for(int j=3; j <= m[i]/2; j+=2){
		    if(m[i]%j == 0){
			p = false;
			break;
		    }
		    p = true;
		}
	    }
	    if(p){
		count++;
	    }
	}
	System.out.println(count);
    }
}

