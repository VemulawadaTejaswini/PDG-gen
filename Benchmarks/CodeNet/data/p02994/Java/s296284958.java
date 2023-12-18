import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Apple = sc.nextInt();
    int Taste = sc.nextInt();
    int Apples_Taste1[]=new int[Apple];
     int Apples_Taste2[]=new int[Apple];
    
    int sum=0;
    int Difference=0;
    for(int i=0; i<Apple;i++){
      Apples_Taste1[i]=Taste+i;
      sum+=Apples_Taste1[i];
    }
    for(int i=0; i<Apple;i++){
      Apples_Taste2[i]=Math.abs(sum-Apples_Taste1[i]);
      if(i>0&& Apples_Taste2[i]>Apples_Taste2[i-1]){
        Difference= Apples_Taste2[i];
      }else{
      	 Difference= Apples_Taste2[0];
      }
    }if(sum>=Difference){
      System.out.println(Difference);
    }else{
    	System.out.println(0-Difference);
    }
  }
}

