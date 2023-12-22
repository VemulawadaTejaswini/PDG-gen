import java.util.*;
class Main{
    public static void main(String[] args){
	int n,m,aaa,max=0,h=0;
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	m = in.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
		aaa = in.nextInt();
		if(aaa == 1)h++;
	    }
	    if(max<h)max=h;
	    h=0;
	}
	System.out.println(max);
    }
}