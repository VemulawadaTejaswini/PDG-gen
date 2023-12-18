import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		long count=0;
		boolean sw=false;
		String answer="";
		
		//入力
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=0;
		int f=0;
		int g=0;
		int h=0;
		
		//処理
		while(sw==false)
		{
			if(a==1)
			{
				e=1;
				break;
             }
             if(b==1)
			{
				e=1;
				break;
             }
             if(c==1)
			{
				e=1;
				break;
             }
             if(d==1)
			{
				e=1;
				break;
             }
		}
        while(sw==false)
		{
			if(a==9)
			{
				f=1;
				break;
             }
             if(b==9)
			{
				f=1;
				break;
             }
             if(c==9)
			{
				f=1;
				break;
             }
             if(d==9)
			{
				f=1;
				break;
             }
		}
		while(sw==false)
		{
			if(a==7)
			{
				g=1;
				break;
             }
             if(b==7)
			{
				g=1;
				break;
             }
             if(c==7)
			{
				g=1;
				break;
             }
             if(d==7)
			{
				g=1;
				break;
             }
		}
		while(sw==false)
		{
			if(a==4)
			{
				h=1;
				break;
             }
             if(b==4)
			{
				h=1;
				break;
             }
             if(c==4)
			{
				h=1;
				break;
             }
             if(d==4)
			{
				h=1;
				break;
             }
		}
		if(e==1 && f==1 && g==1 && h==1)
		{
			answer="YES";
		}else
		{
			answer="NO";
		}
		// 出力
		System.out.println(answer);
	}
}