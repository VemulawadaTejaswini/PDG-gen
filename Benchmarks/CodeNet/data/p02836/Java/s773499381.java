import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sl=s.length();
        int sum=0;

        for(int i=0; i<sl/2; i++){
            String a=s.substring(i,i+1);
            String b=s.substring(sl-(1+i),sl-i);
                if(!a.equals(b)){
                    sum+=1;
                }
        }
        System.out.println(sum);
    }
}