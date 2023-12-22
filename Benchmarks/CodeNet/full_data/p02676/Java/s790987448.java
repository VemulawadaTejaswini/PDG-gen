import java.util.Scanner;
class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(Ststem.in);
        
        int K = sc.nextInt();
        String S = sc.next();
        
        if(S.length() > K){
          System.out.plintln(S.substring(1,K) + "...");
        }else{
          System.out.plintln(S);
        }  
    }
}