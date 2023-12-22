import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt();
		int n=in.nextInt();
		boolean jd=true;
		for(int i=0;i<n;i++){
			int s=in.nextInt(),f=in.nextInt();
			if((s<a && f<=b) || (s>=a && f>b))continue;
			else{
				jd=false;
				break;
			}
		}
		if(jd)System.out.println(0);
		else System.out.println(1);
	}

}
