import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);

		while(true)  {
			try {
				String[] array=br.readLine().split(" ");
				int a=Integer.parseInt(array[0]);
				int b=Integer.parseInt(array[1]);
				int c=Integer.parseInt(array[2]);
				int d=Integer.parseInt(array[3]);
				int e=Integer.parseInt(array[4]);
				if(a==0 && b==0 && c==0 && d==0 && e==0)
					break;
				array=br.readLine().split(" ");
				int na=Integer.parseInt(array[0]);
				int nb=Integer.parseInt(array[1]);
				int nc=Integer.parseInt(array[2]);

				int sum=0;
				if(nc>=d) {
					sum=na*a+nb*b+nc*e;
				} else {
					sum=na*a+nb*b+nc*c;
					if(na+nb+nc>=d) {
						int sum1;
						if(nb+nc>=d) sum1=na*a+(nb+nc-d)*b+d*e;
						else sum1=(na+nb+nc-d)*a+d*e;
						if(sum1<sum) sum=sum1;
					}
				}

				System.out.println(sum);
			} catch(IOException ex) {
				ex.printStackTrace();
				System.exit(-1);
			}
		}
	}
}