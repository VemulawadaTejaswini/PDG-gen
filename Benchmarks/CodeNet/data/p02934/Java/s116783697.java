import java.util.*;
 
public class Main{
 
  public void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();
    double a = 0;
    int i = 0;
    
    while(sc.hasNext()){
    	nums.add(sc.nextInt());
    }
    
    for(int num : nums){
      if(i == 0){
        i++;
      }else{
    	a += 1/num;
        i++;
      }
    }
    
    System.out.println(1/a);
    
  }
}