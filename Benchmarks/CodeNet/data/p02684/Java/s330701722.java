import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputNK = sc.nextLine();
      	String inputA = sc.nextLine();
      	String[] NKlist = inputNK.split(" ", 0);
      	String[] Alist = inputA.split(" ", 0);
      	int[] countlist = new int[Integer.parseInt(NKlist[0])] ;
      	int breaknum = 0;
      	int kei =0;
      	int roop = 0;
      
      	int present = Integer.parseInt(Alist[0]);      
      
      	for(int i=1; i < Long.parseLong(NKlist[1]); i++){
      		countlist[present-1] += 1;
          	if(countlist[present-1] > 2){
            	for(int count : countlist){
                	if(count >= 2){
                    	roop += 1;
                    }
                }
              breaknum = i;
              break;
            }
      	    present = Integer.parseInt(Alist[present-1]);    
        }
      	if(breaknum != 0){
          	kei = ((int)Long.parseLong(NKlist[1])-breaknum)%roop;
         	if(kei<0){
              kei = kei + roop;
            }
          	for(int k=1; k <= kei; k++){
              
          		present = Integer.parseInt(Alist[present-1]);       
        	}
        }
 
      	System.out.println(present);
	}
 
}