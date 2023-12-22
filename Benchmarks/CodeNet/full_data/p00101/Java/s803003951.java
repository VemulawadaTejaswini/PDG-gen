public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		int n = Integer.parseInt(number);
		
		for(int i=0; i<n; i++){
			String str = br.readLine();
			String[] output = str.split(" ", 0);
			int j=0;
			for(j=0; j<(output.length)-1 ;j++){
				
				if(output[j].equals("Hoshino")){
					System.out.print("Hoshina" + " ");
				}
				else{
					System.out.print(output[j] + " "); 
				}	
			}
			if(output[(output.length)-1].equals("Hoshino")){
				System.out.println("Hoshina");
			}
			else{
				System.out.println(output[(output.length)-1]); 
			}
		}	
	}