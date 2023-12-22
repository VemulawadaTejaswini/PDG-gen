import java.io.*;

class Main{
	public static void main(String args[]){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[10];
		for(int i=0;i<10;i++){
			try{
				num[i] = Integer.parseInt(reader.readLine());
			}
			catch(IOException e){
				
			}
		}
		for(int i=0;i<10;i++){
			for(int k=0;k<10-1;k++){
				if(num[k]<num[k+1]){
					int tmp = num[k];
					num[k] = num[k+1];
					num[k+1] = tmp;
				}
			}
		}
		
		for(int i=0;i<3;i++){
			System.out.println(num[i]);
		}
	}
}