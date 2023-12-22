import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n[]= new int [1000];
    	 for(int i=0;;i++){
             n[i] = sc.nextInt(); 
             if(n[i]==0)break;
         }
    	 for(int i=0;n[i]!=0;i++){
    		 int sum=0;
             while(true){
                 sum += n[i]%10;
                 n[i] = n[i]/10;
                 if(n[i] < 1)break;
             }
             System.out.println(sum); 
    	 }
       
    }
}