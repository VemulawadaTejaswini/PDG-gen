import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int num;
		int compare;
		String waku="";
		boolean  make=false;

		int[] a=new int[2];
		int i=0;
		while(true){

			try{
				name=br.readLine();
				StringTokenizer st=new StringTokenizer(name," ");
				while (st.hasMoreTokens()) {
					a[i]=Integer.parseInt(st.nextToken());
					i++;
				}i=0;

				if(a[0]==0 && a[1]==0){
					System.exit(0);
				}

				else{
					for(int j=0; j<a[0]-1; j++){
						if(make == false){
							for(int k=0; k<a[1]; k++){
								waku=waku+"#";
							}
							System.out.println(waku);
							make=true;
						}
						System.out.println(waku);
					}
					System.out.println("");
					waku="";
					make=false;
				}
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}