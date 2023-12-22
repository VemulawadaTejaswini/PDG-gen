import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];
		int i,j,hit=0,blow=0;
		while(s.hasNext()){
			for(i=0;i<4;i++){
				a[i]=s.nextInt();
			}
			for(i=0;i<4;i++){
				b[i]=s.nextInt();
			}
			for(i=0;i<4;i++){
				if(a[i]==b[i]){
					hit++;
				}
				else{
					for(j=0;j<4;j++){
						if(b[i]==a[j])
							blow++;
					}//j for
				}//else
			}//i for
			System.out.println(hit+" "+blow);
			hit=0;blow=0;
		}//while
	}
}