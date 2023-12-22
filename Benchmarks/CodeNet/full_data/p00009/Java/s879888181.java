import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x;
	int cnt=1;
	while(sc.hasNext()){
	    cnt=1;
	    int n = sc.nextInt();
	    for(x=3;x<=n;x++){
		for(int i=2;i<x;i++){
		    if(x%i==0)
			break;
		    else if(i==(x-1))
			cnt++;
		}
	    }
	    System.out.println(cnt);
	}
    }

}