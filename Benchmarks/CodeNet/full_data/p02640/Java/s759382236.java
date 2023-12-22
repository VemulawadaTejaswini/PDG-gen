import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
 
    int cou = 0;
    for(int i=0; i<=X; i++){
    if(Y==i*2+(X-i)*4){
        cou++;
}
}
    if(cou>0){
   	System.out.println("Yes");
    }else{
	System.out.println("No");
      }
}
}
  