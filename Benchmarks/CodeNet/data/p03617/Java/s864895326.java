import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int q = Integer.parseInt(tmpArray[0]);
		int h = Integer.parseInt(tmpArray[1]);
		int s = Integer.parseInt(tmpArray[2]);
		int d = Integer.parseInt(tmpArray[3]);
		
		Product[] products = new Product[4];
		
		products[0] = new Product(0.25,q);
		products[1] = new Product(0.5,h);
		products[2] = new Product(1,s);
		products[3] = new Product(2,d);
		
		Arrays.sort(products, new Comparator<Product>() {
			public int compare(Product a, Product b){
				if( a.pricePerLitterD() > b.pricePerLitterD()){
					return 1;
				}
				else if ( a.pricePerLitterD() < b.pricePerLitterD()){
					return -1;
				}
				else {
					return 0;
				}
			}
		});
		
		long result = 0;
		int require = Integer.parseInt(br.readLine());
		for(int i = 0; i < 4; i++){
			if(products[i].amount == 2){
				if(require <= 1){
					continue;
				}
//				result += products[i].pricePerLitter()*(require/2*2);
//				require -= require/2*2;
				result += products[i].price*(require/2);
				require -= require/2*2;
			}
			else {
				result += products[i].pricePerLitter()*require;
				require = 0;
			}
			
			if(require == 0){
				break;
			}
		}
		System.out.println(result);
	}

}

class Product {
	double amount;
	int price;
	
	public Product(double amount, int price){
		this.amount = amount;
		this.price = price;
	}
	
	public long pricePerLitter(){
	//	return (long)(price/amount);
		if(amount == 0.25){
			return (long)price*4;
		}
		else if(amount == 0.5){
			return (long)price*2;
		}
		else if(amount == 1){
			return price;
		}
		else {
			return price/2;
		}
	}
	
	public double pricePerLitterD(){
		//	return (long)(price/amount);
			if(amount == 0.25){
				return price*4;
			}
			else if(amount == 0.5){
				return price*2;
			}
			else if(amount == 1){
				return price;
			}
			else {
				return (double)price/2;
			}
		}
}
