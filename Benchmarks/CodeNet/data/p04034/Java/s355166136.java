import java.util.Scanner;

class  ball{
	boolean red;
	int num;
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		ball []b=new ball[n];
		b[0]=new ball();
		b[0].red=true;
		b[0].num=1;
		for(int i=1;i<n;i++) {
			b[i]=new ball();
			b[i].num=1;
			b[i].red=false;
		}
		for(int i=0;i<m;i++) {
			int p,q;
			p=sc.nextInt()-1;
			q=sc.nextInt()-1;
			
			if(b[p].red&&b[p].num==1) {
				b[q].red=true;
				b[p].red=false;
			}
			else if(b[p].red==true&&b[p].num>1) {
				b[q].red=true;
				b[p].red=true;
			}
			b[p].num--;
			b[q].num++;
			
           
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			if(b[i].red) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
