import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String wk[] = br.readLine().split(" ", 0);
			int n = Integer.parseInt(""+wk[0]);
			int q = Integer.parseInt(""+wk[1]);
			String name[] = new String[n+1];
			int time[] = new int[n+1];
			int i, ttime=0;
			for(i=0; i<n; i++){
				wk = br.readLine().split(" ", 0);
				name[i] = wk[0];
				time[i] = Integer.parseInt(""+wk[1]);
			}
			while(n>0){
				if(time[0]<=q){
					ttime += time[0];
					System.out.println(name[0]+" "+ttime);
					n--;
				} else{
					ttime += q;
					name[n] = name[0];
					time[n] = time[0]-q;
				}
				for(i=0; i<n; i++){
					name[i] = name[i+1];
					time[i] = time[i+1];
				}
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}