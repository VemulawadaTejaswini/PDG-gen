import java.util.Scanner;
class Main {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
for(;;) {
	int n=sc.nextInt(),x=sc.nextInt(),sum=0;
	if(n==0&&x==0)break;
	else {
		for(int i=1;i<=n;i++) {
			for(int o=1;o<=n;o++) {
				for(int p=1;p<=n;p++) {
					if(i+o+p==x&&i!=o&&o!=p&&p!=i) {
						sum+=1;
					}
				}
			}
		}

		System.out.println(sum/6);
	}
}
sc.close();
  }
}

