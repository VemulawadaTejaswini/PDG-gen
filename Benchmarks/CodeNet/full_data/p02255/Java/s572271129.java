import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String SORT_LENGTH=br.readLine();
		int LENGTH=Integer.parseInt(SORT_LENGTH);
		while (true){
			try{
				int[] hako=new int[LENGTH];
				String obj=br.readLine();

				StringTokenizer st=new StringTokenizer(obj," ");
				int i=0;
			     while (st.hasMoreTokens()) {
			    	 hako[i]=Integer.parseInt(st.nextToken());
			    	 i++;
			     }i=0;

			     String nakami=""+hako[0];
					for(int s=1; s<hako.length; s++){
						nakami=nakami+" "+hako[s];
					}
					System.out.println(nakami);
					nakami="";

				int[] res=Insert_srt(hako);
			}
			catch(Exception e){
				System.exit(0);
			}
		}
	}

	public static int[] Insert_srt(int[] a){		//????????????????????????????????°??¨????????£??\
		int[] ary=a;
		for(int i=1; i<ary.length; i++){
			int v=ary[i];
			int j=i-1;

			while(j>=0 && ary[j]>v){
				ary[j+1] = ary[j];
				j--;
			}
			ary[j+1]=v;
			String ketsugou=""+ary[0];
			for(int s=1; s<ary.length; s++){
				ketsugou=ketsugou+" "+ary[s];
			}
			System.out.println(ketsugou);
			ketsugou="";
		}
		return ary;
	}
}