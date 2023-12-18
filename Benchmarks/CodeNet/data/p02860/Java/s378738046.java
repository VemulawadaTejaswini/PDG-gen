import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();

        if(n==0){
            System.out.println("No");
        }
        if(n%2==0){

            String t1=s.substring(0,(n/2)-1);
            String t2=s.substring(n/2,n-1);
            if(t1.equals(t2)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
                System.out.println("No");
        }
        
    
    }
}