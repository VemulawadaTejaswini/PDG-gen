import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        int sum=0;
        for(int i=0; i<3; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                sum++;
            }
        }
        if(sum==0){
            System.out.println("Good");
        }
        else{
            System.out.println("Bad");
        }
        sc.close();
    }
}