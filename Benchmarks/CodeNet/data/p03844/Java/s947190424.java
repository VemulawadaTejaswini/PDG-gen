		

public class Test002 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] N = line.split(" ");
		int a=Integer.parseInt(N[0]);
	    int b=Integer.parseInt(N[2]);
		
		
		for(int i=0; i<3; i++){
			
			char T = N[i].charAt(0) ;
			
			if(N[1].equals("+")){
			
				System.out.println(a+b);
				break;
			}else if(N[1].equals("-")){
				
				System.out.println(a-b);
				break;
			}
		}
		
	}

}
