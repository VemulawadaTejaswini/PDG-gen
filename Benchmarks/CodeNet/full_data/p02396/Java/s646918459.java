class Main{
	public static void main(String[] args)throws java.io.IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> x = new ArrayList<Integer>(100);
		int i = 0;
		while(true){
			String tmp = input.readLine();
			int num = Integer.parseInt(tmp);
			x.add(num);
			i++;
			if(num == 0) break;
		}
		
		for(int j = 1;j<i;j++){
			System.out.println("case "+j+": "+x.get(j-1));
		}
		
	}
}