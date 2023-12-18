import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String year0=s.substring(0,4);
        int year1=Integer.parseInt(year0);

        if(year1<=2019){
            if(s.charAt(5)=='0'&&s.charAt(6)<='4'){
                if(s.charAt(8)!='3'&&s.charAt(9)!='1'){
                    System.out.println("Heisei");
                }
                else{
                    System.out.println("TBD");
                }
            }
            else{
                System.out.println("TBD");
            }
        }
        else{
            System.out.println("TBD");
        }
        sc.close();
    }
}