import java.util.*;
class Main{
  	public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
      	int a,v,b,w,t,da,db;
      	a=scan.nextInt();
      	v=scan.nextInt();
      	b=scan.nextInt();
      	w=scan.nextInt();
      	t=scan.nextInt();
      	da=a+(v*t);
      	db=b+(w*t);
      	if(da>=db){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
    }
}