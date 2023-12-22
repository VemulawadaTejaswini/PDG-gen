import java.util.*;
public class Main {
  public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	int iLine = sc.nextInt();
	int iBase = sc.nextInt();
	iBase = iBase * iBase;

	int iValue1 = 0;
	int iValue2 = 0;
	int iTotal = 0;
	int iLoop = 0;
	int iCount = 0;

	for( iLoop = 0; iLoop < iLine; iLoop++ ){
		iValue1 = sc.nextInt();
		iValue2 = sc.nextInt();

		iValue1 = iValue1 * iValue1;
		iValue2 = iValue2 * iValue2;
		iTotal = iValue1 + iValue2;

		if(iBase > iTotal){
			iCount++;
		}
	}
    System.out.println(iCount);
  }
}