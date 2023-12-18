
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		//define student positions
		int[] a = new int[N];
		int[] b = new int[N];
		Student[] st = new Student[N];
		for(int i = 0;i<N;i++)
			st[i] = new Student();

		for(int i=0; i<N;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			st[i].a=a[i];
			st[i].b=b[i];
		}
		//define checkpoint positions
		int[] c = new int[M];
		int[] d = new int[M];
		Chkpoint[] chkp = new Chkpoint[M];
		for(int i = 0;i<M;i++){
			chkp[i] = new Chkpoint();
			chkp[i].id = i+1;
		}
		
		for(int i = 0; i<M;i++){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
			chkp[i].c = c[i];
			chkp[i].d = d[i];
		}
		
		for(int i=0; i<N;i++){
			int tmp1 =1000000000 ;
			int tmp2 = 0;
			for(int j=0;j<M;j++){
				 tmp2 = dist(st[i], chkp[j]);
				 if(tmp2<tmp1){
					 st[i].id=chkp[j].id;
					 tmp1=tmp2;
				 }
				
			}
			System.out.println(st[i].id);
		}
		sc.close();


	}

	
	static int dist(Student st, Chkpoint chkp){
		int d = Math.abs(st.a-chkp.c)+Math.abs(st.b-chkp.d);
		return d;
	}
	

}
	class Student{
		int id;
		int a;
		int b;
		
	}
	class Chkpoint{
		int id;
		int c;
		int d;
	}
