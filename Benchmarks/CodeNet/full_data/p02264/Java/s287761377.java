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
			int head=0, tail=n-1;
			for(i=0; i<n; i++){
				wk = br.readLine().split(" ", 0);
				name[i] = wk[0];
				time[i] = Integer.parseInt(""+wk[1]);
			}
			while(n>0){
				if(time[head]<=q){
					ttime += time[head];
					System.out.println(name[head]+" "+ttime);
					for(i=head; i<n-1; i++){
						name[i] = name[i+1];
						time[i] = time[i+1];
					}
					if(head==n-1) head=0;
					if(tail==n-1) tail=0;
					n--;
				} else{
					ttime += q;
					time[head] -= q;
					head++;
					if(head==n) head=0;
					tail++;
					if(tail==n) tail=0;
				}
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}