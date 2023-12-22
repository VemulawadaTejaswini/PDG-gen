import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//データ数
      	String[] result=new String[n];
      	int count_Ac=0;
      	int count_Wc=0;
      	int count_Tle=0;
      	int count_Re=0;
      	
    	for(int i=0;i<n;i++){
			result[i]=sc.next();
          
            if(result[i].equals("AC")){
            	count_Ac+=1;
            }
         	if(result[i].equals("WC")){
            	count_Wc+=1;
            }
            if(result[i].equals("TLE")){
            	count_Tle+=1;
            }
         	if(result[i].equals("RE")){
            	count_Re+=1;
            }          
    
      	}
     	

      
      	
        System.out.println("AC x "+count_Ac); 
        System.out.println("WC x "+count_Wc); 
        System.out.println("TLE x "+count_Tle); 
        System.out.println("RE x "+count_Re);       
    } 
}













