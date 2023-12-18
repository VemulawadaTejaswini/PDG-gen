import java.util.Random;
public  class Main{
  	public static void main(String args[]){
      INT A,B;
      Random ran =newRandom();
      A=random.newInt(13);
      B=random.newInt(13);
      A+=1;
      B+=1;
      if(A==1 && B==1){
         System.out.println("Draw");
      }
      if(A==1 && B!=1){
      	System.out.println("Alice");
      }
      if(A!=1 && B==1){
        System.out.println("Bob");
      }
      if(A < B){
        System.out.println("Bob");
      }
      if(A == B){
        	System.out.println("Draw");
       }
      if(A > B){
        	System.out.println("Alice");
      }
    }
}
