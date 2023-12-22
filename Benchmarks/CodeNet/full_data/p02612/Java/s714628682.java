import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n%1000;
        int ans=0;
        if(a==0){
        ans=0;
        }else{
  		ans=1000-a;
        }
  		
 
    	System.out.println(ans);
    }
}
