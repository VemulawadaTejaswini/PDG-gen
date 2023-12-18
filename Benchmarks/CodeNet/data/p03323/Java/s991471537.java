public class HappyBirthday {
	int cake[] = new int[16];
	public static void main(String args[]){
		boolean message = true;
		int a,b;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		if((a<1) && (a >16)){
			message = false;
		}else if ((b<1) && (b >16)){
			message = false;
		}else if (a<8||b<8){
			message =false;
		}


		if(message){
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}
	}

}