import java.util.*;
public class Main {
  public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	int iLine = sc.nextInt();
	long iBase = (long)sc.nextInt();
    iBase = iBase * iBase;

	long iValue1 = 0;
	long iValue2 = 0;
	long iTotal = 0;
	int iLoop = 0;
	int iCount = 0;

	for( iLoop = 0; iLoop < iLine; iLoop++ ){
		iValue1 = (long)sc.nextInt();
		iValue2 = (long)sc.nextInt();

		iValue1 = (long)Math.pow(iValue1,2);
		iValue2 = (long)Math.pow(iValue2,2);
		iTotal = iValue1 + iValue2;
      
		if(iBase >= iTotal){
			iCount++;
		}
	}
    System.out.println(iCount);
  }
}