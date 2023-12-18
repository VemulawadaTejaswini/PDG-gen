 import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Member = sc.nextInt();
    int Point =  sc.nextInt();
    int Times = sc.nextInt();
    int Answers[] = new int[Times];
    int Member_Point[]=new int[Member];
    
    for(int i=0;i<Member;i++){
    	Member_Point[i]=Point;
    }
    for(int i=0;i<Times;i++){
        Answers[i]=sc.nextInt();
    }
    for(int i=0; i<Times;i++){
      for(int j=0; j<Member;j++){
        if(Answers[i]-1!=j){
        	Member_Point[j]-=1;
       	 }else if(Answers[i]-1==j){
       	     continue;
       	 }
    	}
	  }
    for(int i=0;i<Member;i++){
    	//if(Member_Point[i]>=0){
      	if(Member_Point[i]>0){
      	System.out.println("Yes");
      	}else{
      	    System.out.println("No");
      	}
      	
         
    }
  }
}

  