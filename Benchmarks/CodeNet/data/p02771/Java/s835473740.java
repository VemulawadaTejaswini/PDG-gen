public class Main{
	public static void main(String[] args){
    	int A = 1;
        int B = 1;
        int C = 1;
        
      if((A == B && B != C )||(A == C && C != B)||(B == C && C!=A))
        System.out.println("Yes");
    }else{
    System.out.println("No");
    }
}