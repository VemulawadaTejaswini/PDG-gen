import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		while(s.hasNext()){
			int n=s.nextInt();
			for(int a=0;a<10;a++){
				for(int b=0;b<10;b++){
					for(int c=0;c<10;c++){
						for(int d=0;d<10;d++){
							if(a+b+c+d==n){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
			count=0;
		}
	}

}