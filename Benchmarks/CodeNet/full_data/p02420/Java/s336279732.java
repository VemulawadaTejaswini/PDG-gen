import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String mot = "";
		String fro = "";
		String bac = ""; 
		String str;
		String shu = "";
		
		
		
		int count = 0;
		int i = 0;
		int h = 0;
		
		
		while(true){
			
			//System.out.println("word please");
			mot = as.next();
			//System.out.println(mot+"::");
			
			if(mot.equals("-")){
				
				break;
				
			}
			
			shu = mot;
			//System.out.println("number please");
			count = as.nextInt();
			
			for(i=0;i<count;i++){
				
				h = as.nextInt();
				
				fro = shu.substring(0,h);
				bac = shu.substring(h);
				shu = bac + fro;
				
			}
			
			str = shu;
			System.out.println(str);
			
		}

	}

}