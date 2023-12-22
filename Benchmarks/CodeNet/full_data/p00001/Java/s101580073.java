class Main{

public static void main(String[] args){
		try{
			String sub = "";
			int start = 0;
			while(true){

				for (int i = start; i < 9; i++) {
					int num1 = Integer.parseInt(args[i]);
					int num2 = Integer.parseInt(args[i+1]);
					if (num1>num2) {
						sub = args[i+1];
						args[i+1]=args[i];
						args[i] = sub;
					}
				}
				if(start>8)break;
				start++;
			}
		}catch(Exception e){
			
		}
		for (int i = 0; i < 3; i++) {
			String string = args[9-i];
			System.out.println(string);
		}

}


}