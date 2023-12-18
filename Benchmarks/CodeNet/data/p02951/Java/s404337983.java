import java.util.Scanner;
class Main{
  public static void main(String args[]){
	Scanner scanner=new Scanner(System.in).useDelimiter("\\s");
	int maxAmountofA=scanner.nextInt();
    int currentAmountofA=scanner.nextInt();
    int currentAmountofB=scanner.nextInt();
    if(maxAmountofA-currentAmountofA>=currentAmountofB){
    	System.out.println(0); 
    }else{
    	currentAmountofB-=(maxAmountofA-currentAmountofA);
      	System.out.println(currentAmountofB);
    }
	//int maxAmountOfA=
  }
}