import java.util.*;
public class Main{
    public static void main(String[] args){
	int a,b,c,d,cnt=0;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(a=0;a<10;a++){
	    for(b=0;b<10;b++){
		for(c=0;c<10;c++){
		    for(d=0;d<10;d++){
			if((a+b+c+d)==n)
			    cnt++;
		    }
		}
	    }
	}
	System.out.println(cnt);
    }
}