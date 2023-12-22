import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int num;
		int compare;

		int a;
		int b;
		int c;
		int big;

		while(true){

			try{
				StringTokenizer st=new StringTokenizer(name," ");
				a=Integer.parseInt(st.nextToken()); b=Integer.parseInt(st.nextToken()); c=Integer.parseInt(st.nextToken());

				big = Math.max((Math.max(a, b)),(Math.max(a, c)));

				if(big==a){
					if(a<b+c){
						System.out.println("YES");
					}
					else{
						System.out.println("NO");
					}
				}

				else if(big==b){
					if(b<c+a){
						System.out.println("YES");
					}
					else{
						System.out.println("NO");
					}
				}

				else if(big==c){
					if(c<b+a){
						System.out.println("YES");
					}
					else{
						System.out.println("NO");
					}
				}


				name=br.readLine();
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}