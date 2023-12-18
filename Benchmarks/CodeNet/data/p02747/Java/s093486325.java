import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=0;
         
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='h'&&s.charAt(i+1)=='i'){
                ans++;
            }
        }
        if(ans>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }        
        sc.close();
    }
}