import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	double N = (double) scanner.nextInt();
      	int intN = (int) N;
      
      	double taxExcluded = N / 1.08;
      	//System.out.println(taxExcluded);
      	int intTaxExcluded = (int) Math.round(taxExcluded);
      	//System.out.println(intTaxExcluded);
      	double validate = (double) intTaxExcluded * 1.08;
      	//System.out.println(validate);
      	int intValidate = (int) validate;
      	if(intN != intValidate) {
          	//System.out.println(intN);
          	//System.out.println(intValidate);
      		if(intN != intValidate + 1) {
           		System.out.println(":(");
          		return;
            }
        	System.out.println(intValidate + 1);
          	return;
        }
      	System.out.println(intTaxExcluded);
      	
	}
}
 

 

