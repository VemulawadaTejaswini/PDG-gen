

	public static void main(String[] args) throws java.io.IOException {

		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 String line;
		 
		 String[] nq = in.readLine().split(" ");
		 int n= Integer.parseInt(nq[0]);
		 int q= Integer.parseInt(nq[1]);
		
		 String[] av;
		 
		 int a;
		 int v;
		 
		 int[] hist = new int[n];
		 for(int i=0;i<n;i++){
			 hist[i]=0;
		 }
		 
		 int top=1;
		 int second=1;
		 
		 while ((line = in.readLine()) != null) {
		
			 av = line.split(" ");
			 a= Integer.parseInt(av[0]);
			 v= Integer.parseInt(av[1]);
			 
			 hist[a-1]+=v;
			 
			 if(compare(a-1,top-1,hist)){
				 second =top;
				 top = a;
			 }else if(compare(second-1,top-1,hist)){
				 int tmp=top;
				 top = second;
				 second=tmp;
			 }
			
			 System.out.println(top+" "+hist[top-1]);
			 
		 }
		 
	}
	
	private static boolean compare(int a, int b, int[] list){
		
		if(list[a]>list[b]){
			return true;
		}else if(list[a]==list[b]&&a<b){
			return true;
		}
		
		return false;
		
	}
	
}