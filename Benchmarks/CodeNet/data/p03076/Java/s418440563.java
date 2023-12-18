import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class B123 {
  public static void main(String[] args) throws Exception {
    
    System.out.println("Hello Codiva");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
    ArrayList<Integer> arr  = new ArrayList<>();
    for(int i=0;i<5 ;i++){
      arr.add(Integer.parseInt(br.readLine()));
    }
    
	Collections.sort(arr,new Comparator<Integer>(){
      public int compare(Integer e1, Integer e2) {
        if((e1 % 10 != 0) && (e2 % 10 == 0)){
            return 1;
        }else if((e1 % 10 == 0) && (e2 % 10 != 0)){
          return -1 ;
        }
        else{
			return -1 ;
        }
    }
    });
    System.out.println(arr);
    
    Collections.sort(arr,new Comparator<Integer>(){
      public int compare(Integer e1, Integer e2) {
   		if(e1 %10 == 0 && e2 %10 != 0  || (e2 %10 == 0 && e1 %10 != 0)  || e1 % 10 ==0 || e2 % 10 ==0){
          return -1;
        }else{
          if(e1 % 10 < e2 % 10){
            return 1 ;
          }else{
            return -1 ;
          }
        }
    }
    });

    //System.out.println();
	int sum = 0;
    System.out.println(arr);
    for(int i= 0; arr.isEmpty()!=true ;){
     	sum+=arr.remove(i);
      	if(arr.isEmpty()){
          break;
        }else if(sum%10 != 0){
      		sum+= (10-(sum%10));
    	}
    }
    System.out.println(sum);
    
  }
}
