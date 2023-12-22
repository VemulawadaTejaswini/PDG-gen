import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		ArrayList<Long> P=new ArrayList<Long>();
		int ans=0;
		for(long i=2;i<=Math.sqrt(N)+1;i+=2){
			boolean key=false;
			if(N%i==0)
				if(i==2){
					P.add((long)2);i--;
				}
				else{
					for(int j=0;j<P.size();j++){
						if(Math.sqrt(i)<P.get(j))
							break;
						if(i%P.get(j)==0)
							key=true;
					}
					if(key==false)
						P.add((long)i);
				}
		}
		if(P.size()==0)
			P.add(N);
		for(int i=0;N>1;i++){
			long a=0,b=P.get(i);
			while(N%b==0){
				N/=b;a++;
			}
			for(int j=1;a>=j;j++){
				a-=j;ans++;
			}
		}
		System.out.println(ans);
	}
}
