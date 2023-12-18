import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String[] line = br.readLine().split(" ");
		 int N = Integer.parseInt(line[0]);
		 int A = Integer.parseInt(line[1]);
		 int B = Integer.parseInt(line[2]);
		 int[] h = new int[N];
		 int tf = 1;
		 int max=0;
		 int index=0;
		 int no=0;
		 for(int i=0;i<N;i++){
			 h[i]=Integer.parseInt(br.readLine());
		 }

		 while(tf>0){
			 no++;
			 max=0;
			 index=0;
			 tf=0;
			 for(int i=0;i<N;i++){
				 if(max<h[i]){
					 max=h[i];
					 index=i;
				 }
				 h[i]-=B;
				 if(h[i]>0)tf++;
			 }
			 tf-=1;
			 h[index]-=A-B;
			 if(h[index]>0)tf++;
		 }
		 System.out.println(no);
	}

}
