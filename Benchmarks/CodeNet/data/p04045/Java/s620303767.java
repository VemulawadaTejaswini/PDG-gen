import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			String[] tmpArray = line.split(" ");
			int price = Integer.parseInt(tmpArray[0]);
			int errNum = Integer.parseInt(tmpArray[1]);
			line = sc.nextLine();
			String[] errNumVal = line.split(" ");
			
			int[] orderArray=new int[5];
			int tmpprice = price; 
			int order = 10000;
			for(int i = 4; i >=0 ;i--){
				int crrVal = cal(orderArray);
				if(crrVal >= price){
					break;
				}
				int crrOrder = order;

				int orderVal = tmpprice / crrOrder;
				for(String errStr :errNumVal){
					if(orderVal == Integer.parseInt(errStr)){
						orderVal++;
					}
				}
				if(orderVal >= 10){
					orderArray[i+1]++;
					orderArray[i]=0;
				}else if(tmpprice<crrOrder){
					orderArray[i]=0;
				}else{
					orderArray[i] = orderVal;
				}
				tmpprice =tmpprice % order;
				order = order / 10;
			}
			

			System.out.println(cal(orderArray));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

	private static int cal(int[] orderArray) {
		return orderArray[4] * 10000 + orderArray[3] * 1000
				+ orderArray[2] * 100 + orderArray[1] * 10 + orderArray[0];
	}
}