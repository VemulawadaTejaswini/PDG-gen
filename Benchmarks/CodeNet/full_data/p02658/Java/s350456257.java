import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int arrayNum = sc.next();
    long quo = 1;
    for(int i = 0; i < arrayNum)
      quo *= sc.nextLong();
    if(quo /1000000000000000000 > 1){
      quo = -1;
    }
    System.out.println(quo);
  
  }
}