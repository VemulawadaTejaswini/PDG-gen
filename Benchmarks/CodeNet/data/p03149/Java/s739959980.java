import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N1=stdIn.nextInt();
		int N2=stdIn.nextInt();
		int N3=stdIn.nextInt();
		int N4=stdIn.nextInt();
		int h1=0,h2=0,h3=0,h4=0;
		if(N1==1)
			h1++;
		if(N2==1)
			h1++;
		if(N3==1)
			h1++;
		if(N4==1)
			h1++;
		if(h1==0||h1>1)
			System.out.println("NO");
		else{
			if(N1==9)
				h2++;
			if(N2==9)
				h2++;
			if(N3==9)
				h2++;
			if(N4==9)
				h2++;
			if(h2==0||h2>1)
				System.out.println("NO");
			else{
				if(N1==7)
					h3++;
				if(N2==7)
					h3++;
				if(N3==7)
					h3++;
				if(N4==7)
					h3++;
				if(h3==0||h3>1)
					System.out.println("NO");
				else{
					if(N1==4)
						h4++;
					if(N2==4)
						h4++;
					if(N3==4)
						h4++;
					if(N4==4)
						h4++;
					if(h4==0||h4>1)
						System.out.println("NO");
					else{
						System.out.println("YES");
					}
				}
			}
		}
	}

}