import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int s=sc.nextInt();
		int x,y,z;
		int count=0;
		
		for(x=0;x<=k;x++){
			for(y=0;y<=k; y++){
				for(z=k;z>=0;z--){
					if((x+y+z)==s) count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
