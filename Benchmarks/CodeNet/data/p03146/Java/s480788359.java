import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
      	int co = 0;
      
      while(true){
        co++;
		if(s==4||s==2||s==1){
          co=co+3;
          break;
        }
        if(s%2==0){s=s/2;}
        else if(s%2!=0){s=(s*3)+1;}
      }
      
        System.out.println(co);
    }
}