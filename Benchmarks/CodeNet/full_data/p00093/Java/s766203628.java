import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
      //  ArrayList <Double> mou =new ArrayList <Double>();
        int count=0;
        while (true){
        	
        	System.out.println();
        	int a=scan.nextInt();
        	int b=scan.nextInt();
        	if((a|b)==0)break;
        	if(count!=0)System.out.println();
        	
        	boolean flag =true;
        	for(int i=a;i<=b;i++){
        		if(i%400==0||i%4==0&&i%100!=0){
        			System.out.println(i);
        			flag=false;
        		}
        		}
        	if(flag)System.out.println("NA");
        	System.out.println();
        	System.out.println();
        	count++;
        	}
     
        }
      


}