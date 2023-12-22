import java.util.*;
public class ATcoderyen {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        long ans=100,ctr=0;
        while(ans<a)
        {
        	ans=ans+(long)(0.01*ans);
        	ctr++;
        }
        System.out.println(ctr);
	}

}
