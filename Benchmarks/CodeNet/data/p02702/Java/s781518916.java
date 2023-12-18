import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn =new Scanner(System.in);
	//int n =scn.nextInt();
	long val2=(long)(Math.pow(2,31)-1);
	int val3=2019;
	 long val4=(long)(val3);
	String s=scn.next();
	long count=0;
	for(int i=0;i<s.length();i++){
		long val=0l;
		//System.out.print(i+"-->");
		
		  for(int j=i;j<=i+18&&j<s.length();j++){
			
				//System.out.print(j+"A");
		
			val=(val*(long)10)+(long)(s.charAt(j)-'0');
			
			if((val%val4)==0){
			//	System.out.println(val);
				count++;
				
			}
	
		}
		//System.out.println();
	}
  System.out.println(count);
	}

}