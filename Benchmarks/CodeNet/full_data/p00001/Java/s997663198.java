import java.io.*;



class Main{
	public static void main(String[] args)throws IOException{
		int[] height=new int[10];
		BufferedReader[] br=new BufferedReader[10];
		String[] st=new String[10];

		for(int i=0; i<10; i++){
			br[i]=new BufferedReader(new InputStreamReader(System.in));
			st[i]="";
			st[i]=br[i].readLine();
			height[i]=0;
			height[i]=Integer.parseInt(st[i]);
			if(height[i]<0){
				height[i]=Math.abs(height[i]);
			}
		}

		int a=0;


		for(int j=0; j<9; j++){
			for(int k=9; k>j; k--){
				if(height[k]<height[k-1]){
					a=height[k];
					height[k]=height[k-1];
					height[k-1]=a;
				}
			}
		}

		for(int l=0; l<3; l++){
			System.out.println(height[9-l]);
		}
	}
}