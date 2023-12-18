import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int i = 0;	
		int j = 0;
		int max = 0
		String T1 = "A";
		String T2 = "C";
		String T3 = "G";
		String T4 = "T";
		for(i = 0; i< S.length(); i++){
		   if(S.substring(i,i).equals(T1) || S.substring(i,i).equals(T2)||S.substring(i,i).equals(T3)||S.substring(i,i)=.equals(T4)){
		   	j += 1;
		   }
		   if(max < j){
		   	max = j;
		   }
		   if(!(S.substring(i,i).equals(T1)) ||!( S.substring(i,i).equals(T2))||!(S.substring(i,i).equals(T3))||!(S.substring(i,i)=.equals(T4))){
		   	j = 0
		   }
		{ 
		System.out.println(max);  
    }	
}