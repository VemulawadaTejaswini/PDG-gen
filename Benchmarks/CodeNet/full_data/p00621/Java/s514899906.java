import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				/* input */
				String[] line = br.readLine().split(" ");
				int w = Integer.parseInt(line[0]), q = Integer.parseInt(line[1]);

				if(w==0&&q==0){
					br.close();
					break;
				}

				//initialize each with available width
				int[] f = new int[w];
				for(int i=0;i<w;i++){
					f[i] = w-i;
				}
				
				for(int i=0;i<q;i++){
					line = br.readLine().split(" ");
					char c = line[0].charAt(0);
					switch(c){
					case 's':{
						int id = Integer.parseInt(line[1]);
						int width = Integer.parseInt(line[2]);
						//look for available place
						boolean ok = false;
						for(int j=0;j<w;j++){
							if(f[j]>=width){
								for(int k=0;k<width;k++){
									f[j+k] = -id;
								}
								ok = true;
								System.out.println(j);
								break;
							}
						}
						if(!ok) System.out.println("impossible");
						break;
					}
					case 'w':{
						int id = Integer.parseInt(line[1]);
						for(int j=w-1;j>=0;j--){
							if(f[j]==-id){
								if(j==w-1){
									f[j] = 1;
								} else {
									f[j] = (f[j+1]<0)?1:f[j+1]+1;
								}
							}
						}
					}
					}
				}

				
				System.out.println("END");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}