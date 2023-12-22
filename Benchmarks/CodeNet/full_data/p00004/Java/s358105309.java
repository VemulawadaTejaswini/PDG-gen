import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			try{
				String uketori=br.readLine();
				StringTokenizer st=new StringTokenizer(uketori," ");
				int[] a=new int[3];
				int[] b=new int[3];
				int i=0;
				while (st.hasMoreTokens()) {
					if(i<3)a[i]=Integer.parseInt(st.nextToken());
					else b[i-3]=Integer.parseInt(st.nextToken());
					i++;
				}
				i=0;


				int[] c=renh3(a,b,0);
				int[] d=renh3(a,b,1);

				float y_ans=(float)c[2]/(float)c[1];
				float x_ans=(float)d[2]/(float)d[0];


				System.out.println((String.format("%.4f",x_ans))+" "+(String.format("%.4f",y_ans)));
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}

	public static int[] renh3(int[] a,int[] b,int c){		//c 0=a 1=b 2=c 3=d 4=e 5=sum
		int[] res=new int[3];
		int mltp_a=b[c];
		int mltp_b=a[c];

		for(int i=0; i<3; i++){
			res[i]=a[i]*mltp_a-b[i]*mltp_b;
		}
		return res;

	}
}