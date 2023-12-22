import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		while(true){
			Scanner cs=new Scanner(System.in);
			int ans=0;
			int n=cs.nextInt();
			int m=cs.nextInt();
			if (n==0 && m==0)break;
			int a[][]=new int[1000][1000];
			int s[][]=new int[1000][1000];
			for (int i=1;i<=n;i++)
				for(int j=1;j<=m;j++){
					a[i][j]=cs.nextInt();
				}
			for (int i=0;i<=n;i++)
				for (int j=0;j<=m;j++){
					s[i][j]=0;
				}
			for (int i=1;i<=n;i++)
				for (int j=1;j<=m;j++){
					s[i][j]=s[i][j-1]+s[i-1][j]-s[i-1][j-1]+a[i][j];
				}
			for (int st1=1;st1<n;st1++)
				for (int st2=1;st2<m;st2++)
					for (int en1=st1+2;en1<=n;en1++)
						for (int en2=st2+2;en2<=m;en2++){
							int min=a[st1][st2];
							for(int i=st1;i<=en1;i++){
								if (min>a[i][st2])min=a[i][st2];
								if (min>a[i][en2])min=a[i][en2];
							}
							for(int i=st2;i<=en2;i++){
								if (min>a[st1][i])min=a[st1][i];
								if (min>a[en1][i])min=a[en1][i];
							}
							int max=a[st1+1][st2+1];				
							for (int i=st1+1;i<en1;i++)
								for (int j=st2+1;j<en2;j++)
									if (max<a[i][j])max=a[i][j];
							if (max<min&& ans<min*(en1-st1-1)*(en2-st2-1)-(s[en1-1][en2-1]-s[st1][en2-1]-s[en1-1][st2]+s[st1][st2]))
								ans=min*(en1-st1-1)*(en2-st2-1)-(s[en1-1][en2-1]-s[st1][en2-1]-s[en1-1][st2]+s[st1][st2]);
						}
			System.out.println(ans);
		}
	}
}
