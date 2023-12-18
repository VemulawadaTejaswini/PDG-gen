public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			String sN = args[0];
			String sA = args[1];
			String sB = args[2];
			

			int n = Integer.parseInt(sN);
			int a = Integer.parseInt(sA);
			int b = Integer.parseInt(sB);

			int a2 = n-a;
			int b2 = n-b;
			
			int yes = 0;
			int no = 0;
			
			if(a>=b){
				yes = b;
			}else if(a<b){
				yes = a;
			}
			
			if(a2>=b2){
				no = b2;
			}else if(a2<b2){
				no = a2;
			}
			
			
			if(yes-no<0){
				no = 0;
			}else{
				no = yes-no;
			}
			
			System.out.println(yes +" "+ no);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
