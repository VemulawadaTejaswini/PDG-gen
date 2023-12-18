import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a1[]=new int[3];
	int b1[]=new int[3];
	for(int i=0;i!=3;i++) {
		a1[i]=scan.nextInt();
		b1[i]=scan.nextInt();
	}
	for(int i=0;i!=4;i++) {
		if(i==3) {
			System.out.println("NO");
			return;
		}
		for(int m=0;m!=2;m++) {
			int basyo=i+1;
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int mati;
			if(m==0) {
			mati=0;}
			else {
				mati=1;
			}
		for(int j=0;j!=3;j++) {
			if(mati==0) {
				switch(a1[basyo-1]) {
				case 1:a++;break;
				case 2:b++;break;
				case 3:c++;break;
				case 4:d++;break;
				}
			}
			else {
				switch(b1[basyo-1]) {
				case 1:a++;break;
				case 2:b++;break;
				case 3:c++;break;
				case 4:d++;break;
				}	
			}
			if(mati==0) {
				for(int k=0;k!=3;k++) {
					if(b1[basyo-1]==b1[k]) {
						basyo=k+1;
						mati=1;
					}
					if(b1[basyo-1]==a1[k]) {
						basyo=k+1;
						mati=0;
					}
				}	
			}
			else {
				for(int k=0;k!=3;k++) {
					if(a1[basyo-1]==a1[k]) {
						basyo=k+1;
						mati=0;
					}
					if(a1[basyo-1]==b1[k]) {
						basyo=k+1;
						mati=1;
					}
				}
			}
		}

		if(mati==0) {
			switch(a1[basyo-1]) {
			case 1:a++;break;
			case 2:b++;break;
			case 3:c++;break;
			case 4:d++;break;
			}
		}
		else {
			switch(b1[basyo-1]) {
			case 1:a++;break;
			case 2:b++;break;
			case 3:c++;break;
			case 4:d++;break;
			}	
		}
		if(a==1&&b==1&&c==1&&d==1) {
			System.out.println("YES");
		return;
		}
		}
	}
}
}