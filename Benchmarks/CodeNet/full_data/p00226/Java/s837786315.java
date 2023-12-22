import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String r = sc.next();
			String a = sc.next();
			if(r.equals("0") && a.equals("0"))break;
			
			int hit = 0;
			int blow = 0;
			
			for(int i = 0; i < 4; i++)
				if(Integer.parseInt(String.valueOf(r.charAt(i))) == 
				   Integer.parseInt(String.valueOf(a.charAt(i))))
					hit++;
			
			for(int i = 0; i < 4; i++)
				for(int u = 0; u < 4; u++)
					if(Integer.parseInt(String.valueOf(r.charAt(i))) == 
					   Integer.parseInt(String.valueOf(a.charAt(u))))
						blow++;
				
			System.out.println(hit + " " + (blow - hit));
		}sc.close();
	}
}