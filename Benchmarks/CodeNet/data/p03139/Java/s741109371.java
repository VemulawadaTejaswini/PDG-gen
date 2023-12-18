import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
          
          Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

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
