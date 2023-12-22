import java.util.*;
  
class Main{
   public static void main(String[] args){
   	
	int[] len = new int[3];
   	 Scanner input = new Scanner(System.in);
   	
   	for(int i=0; i<len.length;i++){	
    len[i] = input.nextInt();
   	}
   	
   	Arrays.sort(len);
   	System.out.println(len[0]+" "+len[1]+" "+len[2]);
   }
}